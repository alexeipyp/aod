package sut.ist813.kravec;

public class InsertionSort {
    public static void sort(int[] sortArray)
    {
        for (int i = 1; i < sortArray.length; i++) {
            int key = sortArray[i];
            int j = i - 1;
            while (j >= 0 && sortArray[j] > key) {
                sortArray[j + 1] = sortArray[j];
                j = j - 1;
            }
            sortArray[j + 1] = key;
        }
    }
}