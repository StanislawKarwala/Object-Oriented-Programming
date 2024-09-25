package JavaInterface;

/*
Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order.
Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.
*/

import java.util.Arrays;

interface Sortable{
    void sort(int[] array);
}

class BubbleSort implements Sortable{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}

public class Zad7 {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int[] array2 = {13, 11, 535, 27, 84};

        Sortable bubbleSort = new BubbleSort();
        System.out.println("Array before sorting: " + Arrays.toString(array));
        bubbleSort.sort(array);
        System.out.println("Sorted array using BubbleSort:");
        printArray(array);

        Sortable selectionSort = new SelectionSort();
        System.out.println("\nArray2 before sorting: " + Arrays.toString(array2));
        selectionSort.sort(array2);
        System.out.println("Sorted array using SelectionSort:");
        printArray(array2);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
