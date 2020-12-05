package com.company;

public class Main {


    static void printN(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printRange(int A, int B) {

        if (A > B) {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        }

    }


    public static int findNumbers(int k, int s) {
        int result = 0;
        int i = new Double(Math.pow(10, k - 1)).intValue();
        while (i < Math.pow(10, k)) {
            int ssum = 0, num = i;

            while (num > 0) {
                ssum += num % 10;
                num /= 10;
            }

            if (ssum == s) {
                result++;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

        printN(10);
        printRange(10, 5);
        printRange(5, 10);
        System.out.println(findNumbers(2, 3));

    }
}
