//package com.example.crmtim.models;
//
//import com.example.crmtim.enumm.Status;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "orders")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String number;
//    @ManyToOne
//    private Client client;
//    private float price;
//    private LocalDateTime dateTime;
//    private Status status;
//
//
//}
