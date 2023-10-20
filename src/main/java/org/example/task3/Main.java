package org.example.task3;

import static org.example.task3.Main.sum.sum;
import static org.example.task3.Main.sum.sumCalculatorRecurs.sumRec;

public class Main {
    public static void main(String[] args) {
        //Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
        int n = 7;
        int m = 2;
        int result = sum(n, m);
        int resultRec = sumRec(n, m);
        System.out.println("Сумма чисел: " + n + ", которые делятся на " + m + " = " + result);
        System.out.println("Сумма чисел: " + n + ", которые делятся на " + m + " = " + resultRec);
    }

    public class sum {
        public static int sum(int n, int m) {
            int result = 0;
            for (int i = m; i <= n; i += m) {
                result += i;
            }
            return result;
        }

        public class sumCalculatorRecurs {
            public static int sumRec(int n, int m) {
                if (n < m) {
                    return 0;
                }
                if (n % m == 0) {
                    return n + sumRec(n - m, m);
                } else {
                    return sumRec(n - 1, m);
                }
            }
        }
    }
}