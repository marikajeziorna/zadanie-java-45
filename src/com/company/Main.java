package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int nextInt;

        do {
            System.out.println("Give number: ");
            nextInt = scanner.nextInt();
            if (nextInt >= 0) {
                numbers.add(nextInt);
            }
        } while (nextInt >= 0);
        System.out.println("The end");

        MathClass mathClass = new MathClass(numbers);

        System.out.println(mathClass.reverseList(numbers));
        System.out.println(mathClass.getSum());
        System.out.println(mathClass.getBiggest());
        System.out.println(mathClass.getSmallest());
    }
}

