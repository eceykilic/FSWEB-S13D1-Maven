package org.example;

import java.util.Scanner;

public class Main {

    //uygulama kısmı main içinde olmalı
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of the rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("area of the rectangle: " + area(width, height));
        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("area of the circle: " + area(radius));
    }

    public  static boolean shouldWakeUp(boolean isBarking, int clock){
        if(isBarking && ((clock >= 0 && clock < 8) || (clock > 20 && clock <= 23))){
            return true;
        }

        return false;
    }

    // if (clock < 0 || clock > 23 || !isBarking) return false;
    // return clock < 8 || clock >= 20;

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        int[] arr = {firstAge, secondAge, thirdAge};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 13 && arr[i] <= 19){
                return true;
            }
        }

        return false;

       
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {


        if (temp >= 25 && ((isSummer && temp <= 45) || (temp <= 35))) {
            return true;
        }
        return false;
     
    }


    public static double area(double width, double height) {
       if(width < 0 || height < 0){
           return -1;
       } else {
           return width * height;
       }
    }

    public static double area(double radius) {
        if(radius >= 0)
            return radius * radius * Math.PI;
        //Math.pow(radius, 2)
        return -1;
       
    }
}
