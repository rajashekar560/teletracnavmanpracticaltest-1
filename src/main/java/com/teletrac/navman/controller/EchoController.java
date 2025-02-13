package com.teletrac.navman.controller;

import com.teletrac.navman.entity.Echo;
import com.teletrac.navman.service.EchoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EchoController {

    @Autowired
    private EchoService echoService;

    @PostMapping("/echo")
    public ResponseEntity<Echo> saveEcho(@Valid @RequestBody Echo echo) {
        Echo savedEcho = echoService.saveEcho(echo);
        return new ResponseEntity<Echo>(savedEcho, HttpStatus.CREATED);
    }
}
