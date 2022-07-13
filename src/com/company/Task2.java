package com.company;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {22, 13, 55311, 56};
        int minNum = array[0], maxNum = 0, minLength = 1, maxLength = 0;

        for (int i = 0; i < array.length; i++) {
            int length = 1;
            int num = array[i];
            while (num / 10 >= 1) {
                length++;
                num /= 10;
            }
            if (i ==0) {
                minLength = length;
            }
            if (length >= maxLength) {
                maxNum = array[i];
                maxLength = length;
            }
            if (length <= minLength) {
                minNum = array[i];
                minLength = length;
            }
        }
        System.out.println("Max number is: " + maxNum + ". It's length is: " + maxLength);
        System.out.println("Min number is: " + minNum + ". It's length is: " + minLength);
    }
}
