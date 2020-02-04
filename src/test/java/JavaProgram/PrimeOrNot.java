package javaprogram;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                System.out.println(a + " Is not prime");
                flag = true;
                break;
            }


        }
        if (flag = false) {
            System.out.println(+a + "is prime");
        }


    }
}
