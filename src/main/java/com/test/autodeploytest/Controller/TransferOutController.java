package com.test.autodeploytest.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Random;

@RestController
@RequestMapping("transfer")
public class TransferOutController {

    private static final int FILE_SIZE_MB = 1;
    private static final int BUFFER_SIZE = 1024;

    @GetMapping("")
    public ResponseEntity<byte[]> generateFile() throws IOException {
       var data = generateRandomData(FILE_SIZE_MB * BUFFER_SIZE * BUFFER_SIZE);

        var headers = new HttpHeaders();
        headers.setContentDispositionFormData("filename", "random_file.txt");

        return ResponseEntity.ok().headers(headers).body(data);
    }

    private byte[] generateRandomData(int size) {
        var data = new byte[size];
        new Random().nextBytes(data);
        return data;
    }
}
