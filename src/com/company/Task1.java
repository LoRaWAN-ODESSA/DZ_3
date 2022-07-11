package com.company;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayN = {10, -2, 13, -3, 55, 15, 6, 88, 99, 53, 34, 0, -27, 3, 45, 13, -2, 77, 15, 90, 7654};
        int[] arrayK = {13, -2, 77, 15};
        boolean isSubsequence = false;

        for (int i = 0; i < arrayN.length; i++) {
            if (arrayK[0] == arrayN[i] && arrayK.length <= arrayN.length - i) {
                isSubsequence = true;
                for (int j = 1; j < arrayK.length; j++) {
                    if (arrayK[j] != arrayN[i + j]) {
                        isSubsequence = false;
                        break;
                    }
                }
                if (isSubsequence) {
                    System.out.println("Array K is a subsequence of array N!");
                    return;
                }
            }
        }
        System.out.println("Array K is not a subsequence of array N!");
    }
}