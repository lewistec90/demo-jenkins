package com.example.demojenkins.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public static String home(){
        return "home!";
    }
}
