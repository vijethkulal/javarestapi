package javaprogram;

public class FibonacciSeries {

    public static void main(String[] args) {


        int number = 30;
        int temp1 = 0;
        int temp2 = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(temp1 + "+");
            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
    }
}
