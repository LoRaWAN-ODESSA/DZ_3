package com.company;

public class Task4 {
    public static void main(String[] args) {
        int k = 26;
        int position = 1;
        int row = 1;
        int size = 1;
        while (size * size < k) {
            size++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (position <= k && size > position / row) {
                    System.out.print(position + " ");
                    position++;
                } else if (position <= k && size == position / row) {
                    System.out.println(position);
                    position++;
                    row++;
                } else if (position > k && size > position / row){
                    System.out.print("* ");
                    position++;
                } else {
                    System.out.println("* ");
                    position++;
                    row++;
                }
            }
        }
    }
}
