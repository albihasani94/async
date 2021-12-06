package com.albi.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ProcessingService {

    public void process() {
        // Do some processing here

        throw new RuntimeException("Hey, I caught an exception");
    }

    @Async
    public void processAsync() {
        // Do some processing here

        throw new RuntimeException("Hey, I caught an exception");
    }

}
