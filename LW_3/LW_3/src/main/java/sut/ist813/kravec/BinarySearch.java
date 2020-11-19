package sut.ist813.kravec;

public class BinarySearch {
    private static int recursiveSearch(int[] arr, int searchFor, int begin, int end)
    {
        int middle = begin+(end-begin)/2;

        if (begin <= end) {
            if (searchFor == arr[middle])
                return middle;

            if (searchFor < arr[middle])
                return recursiveSearch(arr, searchFor, begin, middle - 1);

            return recursiveSearch(arr, searchFor, middle + 1, end);
        }

        return -1;
    }

    private static int iterativeSearch(int[] arr, int searchFor)
    {
        int begin = 0, end = arr.length - 1;

        while (begin <= end) {
            int middle = begin+(end-begin)/2;

            if (searchFor == arr[middle])
                return middle;

            if (searchFor > arr[middle])
                begin = middle + 1;
            else
                end = middle - 1;
        }

        return -1;
    }

    public static int search (int[] arr, int searchFor, boolean isRecursive)
    {
        if (arr.length == 0 || searchFor < arr[0] || searchFor > arr[arr.length-1])
            return -1;

        if (isRecursive)
            return recursiveSearch(arr, searchFor, 0, arr.length - 1);
        else
            return iterativeSearch(arr, searchFor);
    }
}
