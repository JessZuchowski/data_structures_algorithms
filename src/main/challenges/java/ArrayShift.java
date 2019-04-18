import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        int middle = 2;
        int value = 5;
        for (int i = array.length - 1; i < middle; i++) {
            array[i] = array[i+ 1];
        }
        array[middle] = value;
        System.out.println(Arrays.toString(array));
    }
}







//// add tests
//        public static int[] insertShiftArray (int[] inputArray,int inputInt){
//
//            int[] holdArray = new int[(inputArray.length / 2) + 1];
//            int midPoint = (inputArray.length / 2) + 1;
//            for (int j = midPoint; j < ArrayList.; j++) {
//                holdArray.add(j);
//            }
//            for (int k = 0; k < holdArray.length; k++) {
//                for (int l = midPoint; l < ArrayList.length(); l++) {
//                    k = l;
//                }
//            }
//            return ArrayList;
//        }
//    }
