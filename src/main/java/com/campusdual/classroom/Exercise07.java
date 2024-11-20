package com.campusdual.classroom;

import java.util.List;
import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(5);
        positionInAList(15);

        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(10);
    }

    public static void positionInAList(int num) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<=10; i++){
            numbers.add(i);
        }
        if (numbers.contains(num)) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + numbers.indexOf(num));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros " + num + " números positivos es: " + sum);
    }

    public static void showFirstNaturalNumbers(int num) {
        System.out.print("Los primeros " + num + " números positivos son: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + (i < num ? ", " : ""));
        }
        System.out.println();
    }
}


