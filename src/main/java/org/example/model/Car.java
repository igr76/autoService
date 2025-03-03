package org.example.model;

import org.example.dto.CarStatus;

public class Car {
   // private int number;
    private String brand;
    private String model;
    private int yearOfRelease;
    private double price;
    private String condition;
    private CarStatus carStatus;

  public Car( String brand, String model, int yearOfRelease, double price, String condition, CarStatus carStatus) {
    this.brand = brand;
    this.model = model;
    this.yearOfRelease = yearOfRelease;
    this.price = price;
    this.condition = condition;
    this.carStatus = carStatus;
  }
}
