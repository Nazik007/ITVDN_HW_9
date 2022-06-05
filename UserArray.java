import java.util.Arrays;

public class UserArray {
    public static int[] result(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[0] = value;
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result(array, 36)));
    }
}
