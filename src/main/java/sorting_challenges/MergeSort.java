package sorting_challenges;

public class MergeSort {
    public void merge(int array[], int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        //create temporary arrays
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        //copy data into temp arrays
        for(int i = 0; i < n1; i++)
            Left[i] = array[left + i];
        for( int j = 0; j < n2; j++)
            Right[j] = array[middle + 1 + j];

        //merge temp arrays
        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2) {
            if(Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            } else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }
        //copy elements of Left[]
        while(i < n1) {
            array[k] = Left[i];
            i++;
            k++;
        }
        //copy elements of Right[]
        while( j < n2) {
            array[k] = Right[j];
            j++;
            k++;
        }
    }
    //sort function
    public void sort(int array[], int left, int right) {
        if(left < right) {
            //find middle
            int middle = (left + right)/2;

            //sort both halves
            sort(array, left , middle);
            sort(array, middle + 1, right);

            //merge sorted halves
            merge(array, left, middle, right);

        }
    }
}
