 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort( ) {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        SelectionSort test1 = new SelectionSort();
        int[] newArr = test1.basicSelectionSort(arr);
        for(int i = 0; i < 5; i++) {
        	int a = newArr[i];
        	int b = Sortedarr[i];
            assertEquals("Value at index " + i + " not equal. ", a, b );
        }
    }

    public void testNegative(){

        /** Test data contains negative values only **/

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        /** add tests to check for this unit test **/
        SelectionSort test1 = new SelectionSort();
        int[] newArr = test1.basicSelectionSort(arr);
        for(int i = 0; i < 5; i++) {
        	int a = newArr[i];
        	int b = Sortedarr[i];
            assertEquals("Value at index " + i + " not equal. ", a, b );
        }
    }

    public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
    }
}
********************************************************************************************
        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
    }
}
