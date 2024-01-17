package com.example.crmtim.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private Long id;
    private String firstName;
    private String secondName;
    private String phoneNumber;
}
