package org.example.task5;



public class Main {
    public static void main(String[] args) {

        CustomDynamicArray array = new CustomDynamicArray();
        array.add(1);
        System.out.println(array);
        array.printInnerStructure();

        array.add(2);
        System.out.println(array);
        array.printInnerStructure();

        array.add(3);
        System.out.println(array);
        array.printInnerStructure();

        array.add(4);
        System.out.println(array);
        array.printInnerStructure();

        array.add(5);
        System.out.println(array);
        array.printInnerStructure();

        array.addAt(0, 10);
        System.out.println(array);
        array.printInnerStructure();

        array.remove();
        System.out.println(array);
        array.printInnerStructure();


    }
}


