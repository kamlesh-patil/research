package com.example.demo.controller;

import com.example.demo.dto.ApplicationLabelDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ApplicationLabelController {
    @PostMapping
    public Boolean save(@RequestBody @Valid ApplicationLabelDTO applicationLabelDTO){
        System.out.println("Hello");
        return true;
    }
}