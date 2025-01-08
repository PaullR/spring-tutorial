package com.spring.tutorials.springtutorials.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/myNotices")
    public String getNoticesDetails() {
        return "Notices details from DB";
    }
}
