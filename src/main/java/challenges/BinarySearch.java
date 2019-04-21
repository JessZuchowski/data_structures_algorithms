package challenges;

public class BinarySearch {
    public static void main (String[] arg){
        //tests
        System.out.println(binarySearch(new int[] {2, 4, 6, 8, 10}, 7));
        binarySearch(new int[] {2, 4, 6, 8, 10}, 7);

        System.out.println(binarySearch(new int[] {2, 4, 6, 5, 8, 10}, 4));
        binarySearch(new int[] {2, 4, 6, 5, 8, 10}, 4);

        System.out.println(binarySearch(new int[] {2, 4, 6, 5, 8, 10}, 10));
        binarySearch(new int[] {2, 4, 6, 5, 8, 10}, 10);
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length;
        if (array.length == 0) {
            return -1;
        }
        while (left != right) {
            int mid = ((left + right) / 2);
        if (array[mid] == target) {
            return mid;
        }
        else if (array[mid] < target) {
            left = (int) Math.ceil((float) (left + right) / 2);
        }
        if (array[mid] > target) {
            right = (int) Math.floor((float) (left + right) / 2);
        }
        if (array[left] == target) {
            return left;
        }
        }
        return -1;
    }
}