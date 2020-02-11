package com.fitrasalam;

public class Circle {

    private double PI = 3.14159;
    private Double radius = 1.0;
    private String color = "Black";

    //contrucktor
    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;

        getRadius();
        getColor();
        getArea();
    }

    public Circle(){

    }

    void Circle_Tidak_Berparameter() {
        System.out.println(radius);
        System.out.println(color);
    }

    void Circle_Berparameter(){
        System.out.println(color);
    }


    public void getRadius() {
        System.out.println("Nilai Radius: " + radius);

    }

    public void getColor(){
        System.out.println("Color: " + color);
    }

    public void getArea() {
        System.out.println("Luas area: " + PI * radius * radius);
    }
}