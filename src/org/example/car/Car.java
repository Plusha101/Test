package org.example.car;


public class Car {
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println("Едем!");
    }

    public void stop() {
        System.out.println("Остановливаемся!");
    }

    public String getInfo() {
        return "Информация: Цвет: " + color + " Модель: " + model;
    }
}
