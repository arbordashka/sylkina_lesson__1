package com.geekbrains;

import java.util.SortedMap;

public class main {


    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void  printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
}
    public static void checkSumSign(){
        int a = 10;
        float b = 3.14f;
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
    public static void printColor(){
        int value = 400;
        if (value <=0 ){
            System.out.println("Красный");
        } else if (value>0 && value<= 100){
            System.out.println("Желтый");
        } else System.out.println("Зеленый");

    }
    public static void compareNumbers(){
        int a = -81;
        int b = 10;
        if (a >= b)
            System.out.println("a>=b");
        else System.out.println("a<b");

    }

}