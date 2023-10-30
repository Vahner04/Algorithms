package org.example.task5;


import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomDynamicArray implements Iterable<Integer> {
    private int[] data;
    private int size;
    private int count;

    public CustomDynamicArray() {
        data = new int[1];
        size = 1;
        count = 0;
    }

    public CustomDynamicArray(int capacity) {
        data = new int[capacity];
        size = capacity;
        count = 0;
    }

    public void add(int element) {
        if (count >= size) {
            growSize();
        }
        data[count++] = element;
    }

    private void growSize() {
        int newSize = size * 2;
        int[] newData = new int[newSize];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
        size = newSize;
    }

    public void addAt(int index, int element) {
        if (index >= count) throw new IndexOutOfBoundsException("Input index is out of bounds");
        if (count >= size) {
            growSize();
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        count++;
    }

    public void remove() {
        if (count == 0) throw new NoSuchElementException();
        data[count - 1] = 0; // data[count - 1] = null - necessary in case of objects for Garbage Collector
        count--;
//        shrinkSize();
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }
        for (int i = index; i < count - 1; i++) {
            data[i] = data[i + 1];
        }
        data[count - 1] = 0;
        count--;
    }

    public void shrinkSize() {
        if (count < size) {
            int[] newData = new int[count];
            System.arraycopy(data, 0, newData, 0, count);
            data = newData;
            size = count;
        }
    }

    public void set(int index, int data) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }
        this.data[index] = data;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }
        return data[index];
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            data[i] = 0;
        }
        count = 0;
    }

    public boolean contains(int data) {
        for (int i = 0; i < count; i++) {
            if (this.data[i] == data) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < count;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return data[currentIndex++];
            }
        };
    }
    @Override
    public String toString() {
        return "[" + Arrays.stream(data).limit(count).boxed()
                .map(Object::toString).reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("") + "]";
    }

    public void printInnerStructure() {
        System.out.println("Inner Structure: " + Arrays.toString(data));
    }

}
