package com.company;

public class Main {

    public static void main(String[] args) {

        FigGeom[] arr = {
          new Circle(10),
          new Square(5)

        };

    }
}

abstract class FigGeom{
    public abstract double getField();

}

class Circle
  extends FigGeom{

    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getField() {
        return Math.PI * (radius * radius);
    }
}

class Square
   extends FigGeom{

    private double side;

    public Square(double side){

    }

    @Override
    public double getField() {
        return side * side;
    }
}