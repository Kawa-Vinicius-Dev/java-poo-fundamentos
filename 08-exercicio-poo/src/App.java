/*
Write a Java program to create a class called Rectangle with
private instance variables length and width.
Provide public getter and setter methods to access and modify
these variables.
*/

public class App {
    public static void main(String[] args)  {
        Rectangle rectangle = new Rectangle(10, 15);
        rectangle.status();
        rectangle.setHeight(10);
        rectangle.status();
    }

}
