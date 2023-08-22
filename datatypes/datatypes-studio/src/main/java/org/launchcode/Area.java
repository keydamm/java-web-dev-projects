package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        Double radius = input.nextDouble();
//        Double pi = 3.14;
//        Double a = pi*radius*radius;

        System.out.println("The area of a circle of radius " + radius + " is " +Circle.getArea(radius));

        input.close();
    }
}
