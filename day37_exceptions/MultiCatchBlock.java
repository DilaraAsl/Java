package day37_exceptions;

import day35_polymorphism.polymorphismTask.transportationTask.Car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Car car = null;
        try {
            car.drive();
        } catch (ArithmeticException e) {
            System.out.println("First Catch Block -Arithmetic Exception");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Second Catch Block -Class Cast Exception");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third  Catch Block -Null Pointer Exception");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fourth  Catch Block -Null Index Out of Bounds Exception");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Fifth Catch Block -Runtime Exception");
            e.printStackTrace();
        }

        System.out.println("_________________________________________________________________");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
