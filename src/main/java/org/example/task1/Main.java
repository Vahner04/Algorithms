package org.example.task1;

import static org.example.task1.BinarAndCl.SingleElementFinder.binarnString.findSingleElementBinary;
import static org.example.task1.BinarAndCl.SingleElementFinder.findSingleElement;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int result = findSingleElement(arr);
        if (result != -1) {
            System.out.println("Найден одиночный элемент: " + result);
        } else {
            System.out.println("Одиночный элемент не найден.");
        }

        System.out.println("Через бинарный поиск: ");
        int[] arry = {1, 1, 2, 2, 3, 3, 4,4,5};
        result = findSingleElementBinary(arry);
        System.out.println("Найден одиночный элемент: " + result);
    }
}



