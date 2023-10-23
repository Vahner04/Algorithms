package org.example.task4;

import static org.example.task4.Calculator.calculator;
import static org.example.task4.MinimalCostPath.findMinimalCost;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int result = calculator(n);
        System.out.println(" n-й член последовательности в формуле: 7) = a(23 + 1) = a(3) - a(2) = " + result);
        System.out.println("====================================================================================");
        int[][] pathCost1 = new int[][] {
                {0,  11,  0,  0,  0, 0},
                {10, 10, 10, 10, 10, 0},
                {10, 10, 10,  4, 10, 0},
        };
        int minimalCost1 = findMinimalCost(pathCost1);
        System.out.println("Минимальная стоимость первого пути: " + minimalCost1);
        int[][] pathCost2 = new int[][] {
                {0,  11,  0,  0,  0, 100},
                {10, 10, 10, 10, 10,   0},
                {10, 10, 10,  4, 10,   0},
        };
        int minimalCost2 = findMinimalCost(pathCost2);
        System.out.println("Минимальная стоимость второго пути: " + minimalCost2);
    }

}
