
public class SelectionSort {
 private int temp;
 private int temp2;
/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * pre-condition:
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length-1; i++) {
        	temp = i;

            for (int j= i+1; j < x.length; j++) {
                if (x[j] < x[temp]) {
                    temp = j;
                }
            } // end of inner for loop
            temp2 = x[i];
            x[i] = x[temp];
            x[temp]= temp2;

        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
