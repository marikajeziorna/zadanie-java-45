package com.company;

import java.util.ArrayList;
import java.util.List;

public class MathClass {
    List<Integer> numberList;

    public MathClass(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> reverseList(List<Integer> numberList) {
        List<Integer> reverseNumberList = new ArrayList<>();
        for (int i = numberList.size() - 1; i >= 0; i--) {
            reverseNumberList.add(numberList.get(i));
        }
        return reverseNumberList;
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
        return sum;
    }

    public int getSmallest() {
        int smallestNumber = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    public int getBiggest() {
        int biggerNumber = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (number > biggerNumber) {
                biggerNumber = number;
            }
        }
        return biggerNumber;
    }
}
