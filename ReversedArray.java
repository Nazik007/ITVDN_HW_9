import java.util.Arrays;

public class ReversedArray {
    public static int[] myReverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
        return newArray;
    }

     public static int[] subArray(int[] array, int index, int count) {
         int[] sliceArray = new int[count];
         int j = 0;

         for (int i = index - 1; i < index + count - 1; i++) {
             if (array.length > i){
                 sliceArray[j] = array[i];
             } else {
                 sliceArray[j] = 1;
             }
             j++;
         }
         return sliceArray;
     }


    public static void main(String[] args) {
        int[] array = {7, 8, 9, 10, 11, 34, 54, 43, 65};
        System.out.println("Даний масив: " + Arrays.toString(array));
        System.out.println("Масив у зворотньму порядку: " + Arrays.toString(myReverse(array)));
        System.out.println("Масив після виконання методу: " + Arrays.toString(subArray(array,2,12)));
    }
}
