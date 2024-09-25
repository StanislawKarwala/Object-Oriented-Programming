package JavaInterface;

/*
Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order.
Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.
*/

interface Sortablee{
    void sort(int[] array);
}

class QuickSort implements Sortable {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

class MergeSort implements Sortable {
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);

            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[low + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] >= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

public class Zad11 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 8, 0, 3, 1, 6};
        int[] arr2 = {1, 15, 13, 15, 20, 3, 11, 26};

        Sortable quickSort = new QuickSort();
        quickSort.sort(arr);

        System.out.print("Quick Sort (Descending Order): ");
        printArray(arr);

        Sortable mergeSort = new MergeSort();
        mergeSort.sort(arr2);

        System.out.print("Merge Sort (Descending Order): ");
        printArray(arr2);
    }

    private static void printArray(int[] arr) {
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
