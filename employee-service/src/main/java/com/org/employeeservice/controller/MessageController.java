package com.org.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/api/employee-service")
public class MessageController {
        @Value("${spring.boot.message}")
        private String msg;

        @GetMapping("/msg")
        public String MessageController() {
            return msg;
        }
}
