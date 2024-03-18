package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public  static boolean shouldWakeUp(boolean isBarking, int hour){
        if(isBarking && ((hour >= 0 && hour < 8) || (hour > 20 && hour <= 23))){
            return true;
        }

        return false;
    }


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
        return -1;
       
    }
}
