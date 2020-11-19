package sut.ist813.kravec;

import java.util.Random;
import sut.ist813.kravec.QuickSort;
import sut.ist813.kravec.BinarySearch;

public class App 
{
    public static int[] generateRandomArray(int size, int bound)
    {
        Random rand = new Random();
        int[] initArray = new int[size];
        for (int i = 0; i < size; i++)
            initArray[i] = rand.nextInt(bound);

        return initArray;
    }

    public static void main(String[] args)
    {
        int size = 10;
        int bound = 100;
        int[] sortArray = generateRandomArray(size, bound);
        QuickSort.sort(sortArray, 0, size-1);

        for (int i = 0; i < size; i++)
            System.out.print(sortArray[i] + " ");
        System.out.println("\n");

        int searchFor = 75;
        int searchResult = BinarySearch.search(sortArray, searchFor, false);

        if (searchResult == -1)
            System.out.println("Число " + searchFor + " не найдено");
        else
            System.out.println("Число " + searchFor + " найдено в массиве под индексом " + searchResult);
    }
}