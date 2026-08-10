/*
Write a Java program to create a class called Circle with
a private instance variable radius.
Provide public getter and setter methods to access and modify
the radius variable. However, provide
two methods called calculateArea() and calculatePerimeter()
that return the calculated area and perimeter based on
the current radius value.
*/

public class App {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.status();
        circle.setRadius(12);
        circle.status();
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());
    }
}
