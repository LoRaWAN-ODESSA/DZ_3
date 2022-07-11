package com.company;

public class Task4 {
    public static void main(String[] args) {
        int k = 40;
        int size = 1;
        while (size * size <= k) {
            size++;
        }
        size--;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j != size - 1) {
                    System.out.print("1 ");
                    k--;
                } else {
                    System.out.println("1 ");
                    k--;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print("1 ");
        }
    }
}
