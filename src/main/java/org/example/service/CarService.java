package org.example.service;

import org.example.dto.CarStatus;
import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    List<Car> carList;
    public void addNew(Car car) {
        if (carList == null || carList.isEmpty()) {
            carList = new ArrayList<>();
        } else if (carList.equals(car)) {
            System.out.println("Извините такой автомобиль уже есть");
        }else {carList.add(car);}

    }
    public List<Car> findAll() {
        if (carList == null || carList.isEmpty()) {
            System.out.println("авто нет"); return null;
        } else {
            return carList;
        }
    }
    public void update(Car car) {
        if (carList.equals(car)) {
            carList.add(carList.indexOf(car),car);
        }
    }
    public boolean delete(Car car) {
        return false;
    }
    public List<Car> filter(String filter) {
        return null;
    }
    public List<Car> filter3388888888888888888(String filter) {
        return null;
    }
}
