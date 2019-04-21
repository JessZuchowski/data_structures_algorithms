package challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        //test arrays and value
        insertShiftArray(new int[] {1, 3, 5}, 7);
        insertShiftArray(new int[] {2, 4, 6, 8}, 7);
        insertShiftArray(new int[] {1, 2, 3, 4, 5, 6}, 7);
    }

    public static int[] insertShiftArray(int[] originalArray, int addedValue) {
        int[] tempArray = new int[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            tempArray[i] = originalArray[i];
        }
        for (int j = originalArray.length / 2; j < originalArray.length; j++) {
            tempArray[j + 1] = originalArray[j];
        }
        tempArray[originalArray.length / 2] = addedValue;

        System.out.println("input:" + Arrays.toString(originalArray));
        System.out.println("output:" + Arrays.toString(tempArray));
        return tempArray;
    }
}