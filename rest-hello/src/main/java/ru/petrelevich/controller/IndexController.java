package ru.petrelevich.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
public class IndexController {

    @GetMapping("/")
    public String index() throws UnknownHostException {
        return "Hi, it works, host: " + InetAddress.getLocalHost().getHostName();
    }
}