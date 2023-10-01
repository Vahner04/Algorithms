package org.example.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(2));

    }

    //1. Написать рекурсивную функцию вычисления факториала factorial(n) - произведения всех чисел
    //                          до n включительно
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
//    a) O(n * m) - первом n раз, во втором m раз
//      for (int i = 0; i < n; ++i) {
//        for (int j = 1; j < m; ++j) {
//            a[i][j]++;
//        }
//    }
//
//
//    // b)  O(n^2) - два цикла с n
//        for (int i = 0; i < n-1; ++i) {
//        for (int j = 0; j < n-i; ++j) {
//            a[i][j]++;
//        }
//    }
//
//
//    // c) O(n * log3(n))
//        for (int i = 0; i < n; ++i) {
//        for (int j = 1; j < n; j *= 3) {
//            a[i][j]++;
//        }
//    }
//
//
//    //d)  O(n)
//        for (int i = 0; i < 1000; ++i) {
//        for (int j = 1; j < n; ++j) {
//            ++count;
//        }
//    }
//
//
//    //e)
//        for (int i = 0; i < n; ++i) {
//        for (int j = 0; j < n/3; ++j) {
//            matrx[i][i]++;
//        }
    }

}
