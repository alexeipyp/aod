package sut.ist813.kravec;
import java.util.Random;
import sut.ist813.kravec.BubbleSort;
import sut.ist813.kravec.InsertionSort;
import sut.ist813.kravec.SelectionSort;
import sut.ist813.kravec.QuickSort;

public class App
{
    public static int[] genenateRandomArray(int size)
    {
        Random gen = new Random();
        int initArray[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            initArray[i] = gen.nextInt();
        }
        return initArray;
    }

    public static void main( String[] args )
    {
        int size = 1000000;
        final int mult = 1000000;
        long beginTime, totalTime;
        for (int j = 1; j <= 20;j++)
        {
            int[] sortArray = genenateRandomArray(size);
            beginTime = System.currentTimeMillis();
            QuickSort.sort(sortArray, 0, size-1);
            totalTime = System.currentTimeMillis() - beginTime;
            System.out.println(size + "\t" + totalTime/1000.0); //size + "\t" +
            size += mult;
        }
    }
}