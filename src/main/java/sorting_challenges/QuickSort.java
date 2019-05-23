package sorting_challenges;

public class QuickSort {
    int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j < high; j++) {
            if(array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public void sort(int array[], int low, int high) {
        if(low < high) {
            int partitionIndex = partition(array, low, high);

            sort(array, low, partitionIndex - 1);
            sort(array, partitionIndex + 1, high);
        }
    }

}
