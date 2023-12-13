package com.example.task1;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TwitterUser {
    private String email;
    private String UserCountry;
    private LocalDate UserActiveTime;
}
