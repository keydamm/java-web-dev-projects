package org.launchcode;

import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");

        int length = input.nextInt();

        System.out.println("What is the width of your rectangle?");

        int width = input.nextInt();
        int area;

        area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
