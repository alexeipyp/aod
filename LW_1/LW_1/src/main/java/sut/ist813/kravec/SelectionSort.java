package sut.ist813.kravec;

public class SelectionSort {
    public static void sort(int[] sortArray)
    {
        for (int i = 0; i < sortArray.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[minElementIndex] > sortArray[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = sortArray[i];
                sortArray[i] = sortArray[minElementIndex];
                sortArray[minElementIndex] = temp;
            }
        }
    }
}