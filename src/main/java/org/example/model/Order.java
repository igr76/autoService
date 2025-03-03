package org.example.model;

import org.example.dto.OrderStatus;

import java.time.LocalDate;

public class Order {
    private int orderNumber;
    private LocalDate orderData;
    private Car car;
    private User person;
    private OrderStatus orderStatus;

}
