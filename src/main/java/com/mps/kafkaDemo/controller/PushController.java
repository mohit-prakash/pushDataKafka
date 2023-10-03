package com.mps.kafkaDemo.controller;

import com.mps.kafkaDemo.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PushController {
    @Autowired
    private PushService pushService;

    @RequestMapping("/push")
    public ResponseEntity<String> push() {
        String msg = pushService.push();
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
