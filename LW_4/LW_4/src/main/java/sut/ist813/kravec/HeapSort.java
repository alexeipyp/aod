package sut.ist813.kravec;

public class HeapSort {
    private static void addToHeap(int arr[], int n, int k)
    {
        int new_elem = arr[k];
        int child;

        while (k < n/2)
        {
            child = 2*k + 1;
            if (child < (n-1) && arr[child] < arr[child+1])
                child++;
            if (new_elem >= arr[child])
                break;
            arr[k] = arr[child];
            k = child;
        }
        arr[k] = new_elem;
    }

    public static void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n/2 - 1; i >= 0; i--)
            addToHeap(arr, n, i);

        for (int j = n-1; j > 0; j--)
        {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            addToHeap(arr, j, 0);
        }
    }
}
