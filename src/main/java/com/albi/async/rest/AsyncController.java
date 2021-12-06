package com.albi.async.rest;

import com.albi.async.service.ProcessingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class AsyncController {

    private final ProcessingService processingService;

    public AsyncController(ProcessingService processingService) {
        this.processingService = processingService;
    }

    @GetMapping("/process")
    public ResponseEntity<String> getResult() {
        try {
            processingService.process();
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/processAsync")
    public ResponseEntity<String> getAsyncResult() {
        try {
            processingService.processAsync();
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
