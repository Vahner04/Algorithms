package org.example.task1;

public class BinarAndCl {
    public class SingleElementFinder {
        public static int findSingleElement(int[] arr) {
            for (int i = 0; i < arr.length; i += 2) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
            return -1; // Если элемент не найден
        }

        public class binarnString {
            public static int findSingleElementBinary(int[] arr) {
                int left = 0;
                int right = arr.length - 1;

                while (left < right) {
                    int mid = (left + right) / 2;
                    if (mid % 2 == 1) {
                        mid--; // Убедимся, что mid всегда четное число
                    }
                    if (arr[mid] != arr[mid + 1]) {
                        right = mid;
                    } else {
                        left = mid + 2;
                    }
                }

                return arr[left];
            }
        }
    }
}


