package sut.ist813.kravec;

public class QuickSort {
    public static void sort(int[] sortArray, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(sortArray, begin, end);

            sort(sortArray, begin, partitionIndex-1);
            sort(sortArray, partitionIndex+1, end);
        }
    }

    private static int partition(int sortArray[], int begin, int end) {
        int pivot = sortArray[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (sortArray[j] <= pivot) {
                i++;

                int swapTemp = sortArray[i];
                sortArray[i] = sortArray[j];
                sortArray[j] = swapTemp;
            }
        }

        int swapTemp = sortArray[i+1];
        sortArray[i+1] = sortArray[end];
        sortArray[end] = swapTemp;

        return i+1;
    }
}
