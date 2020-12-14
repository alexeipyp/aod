package sut.ist813.kravec;

import java.util.Random;
import sut.ist813.kravec.HeapSort;
import sut.ist813.kravec.RadixSort;

public class App 
{
    public static int[] generateRandomArray(int size, int bound, int startFrom)
    {
        Random rand = new Random();
        int[] initArray = new int[size];
        for (int i = 0; i < size; i++)
            initArray[i] = rand.nextInt(bound) + startFrom;

        return initArray;
    }
    public static void main( String[] args )
    {
        int startFrom = 1000;
        int bound = 8999;
        int size = 2500000;
        final int mult = 2500000;
        long beginTime, totalTime;
        for (int j = 1; j <= 20; j++) {
            int[] sortArray = generateRandomArray(size, bound, startFrom);
            beginTime = System.currentTimeMillis();
            HeapSort.sort(sortArray);
            totalTime = System.currentTimeMillis() - beginTime;
            System.out.println(size + "\t" + totalTime / 1000.0); //size + "\t" +
            size += mult;
        }
    }
}
