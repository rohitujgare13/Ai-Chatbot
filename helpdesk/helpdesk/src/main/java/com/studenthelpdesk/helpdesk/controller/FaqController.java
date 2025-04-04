package com.studenthelpdesk.helpdesk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FaqController {

    @GetMapping("/faqs")
    public List<String> getFaqs() {
        return Arrays.asList(
                "What is the exam fee?", "The exam fee is ₹1500.",
                "Where can I find the timetable?","Exams start in May.",
        "Who is the placement coordinator?","Login to the student portal."
        );
    }

    @GetMapping("/")
    public String home() {
        return "Controller is working!";
    }
}
