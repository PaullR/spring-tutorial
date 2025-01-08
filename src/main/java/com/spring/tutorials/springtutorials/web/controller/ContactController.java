package com.spring.tutorials.springtutorials.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/myContact")
    public String getContactDetails() {
        return  "Contact details from DB";
    }
}
