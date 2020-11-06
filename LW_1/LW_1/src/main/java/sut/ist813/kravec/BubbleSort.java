package sut.ist813.kravec;

public class BubbleSort {
    public static void sort(int[] sortArray)
    {
        for(int i = sortArray.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( sortArray[j] > sortArray[j+1] ){
                    int tmp = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = tmp;
                }
            }
        }
    }
}