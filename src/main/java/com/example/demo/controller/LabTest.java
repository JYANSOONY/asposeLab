package com.example.demo.controller;


import com.example.demo.service.HtmlToTableExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class LabTest {
    final private HtmlToTableExampleService htmlToTableExampleService;
    @GetMapping("/1")
    public void boardDouwnload() throws Exception {
        htmlToTableExampleService.activeUserReport();
    }
}
