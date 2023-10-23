package org.example.task4;

public class Calculator {
    public static int calculator(int n) {
        if (n == 0 || n == 1) {
            return  1;
        }else if (n % 2 == 0){
            return calculator(n / 2) + calculator(n / 2 - 1);
        } else {
            return calculator(n / 2) - calculator(n / 2 - 1);
        }

    }
}
