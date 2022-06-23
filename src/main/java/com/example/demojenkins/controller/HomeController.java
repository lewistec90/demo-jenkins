package com.example.demojenkins.controller;

import com.example.demojenkins.service.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<String> home(){
        return ResponseEntity.ok(HomeService.home());
    }
}
