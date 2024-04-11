import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {
    private SelectionSort sorter = new SelectionSort();


public void testMixed(){
    int[] arr = {3, -1, 0, -3, 5, 2};
    int[] Sortedarr = {-3, -1, 0, 2, 3, 5};
    assertArrayEquals("Testing an array with mixed numbers", Sortedarr, new SelectionSort().basicSelectionSort(arr));
}

public void testDuplicates(){
    int[] arr = {3, -1, 2, 3, -1, 5, 2};
    int[] Sortedarr = {-1, -1, 2, 2, 3, 3, 5};
    assertArrayEquals("Testing an array with duplicates", Sortedarr, new SelectionSort().basicSelectionSort(arr));
}

}
