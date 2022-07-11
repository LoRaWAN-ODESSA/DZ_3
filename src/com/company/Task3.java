package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {2, 34, 553, 34, 9873, 1233, 22, 1234561, 22222, 1, 398662829, 19283734, 3, 11, 987463, 12345, 67894, 1230, 8876, 47, 56765};

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            int num = array[i];
            int length = 1;
            while (num / 10 >= 1) {
                length++;
                num /= 10;
            }
            int[] numArray = new int[length];
            num = array[i];
            for (int j = 0; j < numArray.length; j++) {
                if (num / 10 >= 1) {
                    numArray[j] = num % 10;
                    num /= 10;
                } else {
                    numArray[j] = num;
                }
            }
            if (numArray.length == 1) {
                System.out.println(numArray[0]);
            } else {
                for (int k = 0; k < numArray.length; k++) {
                    for (int l = 0; l < numArray.length; l++) {
                        if (k != l && numArray[k] == numArray[l]) {
                            isUnique = false;
                            break;
                        }
                    }
                }
                if (isUnique) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
