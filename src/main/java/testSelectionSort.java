import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {
    private SelectionSort sorter = new SelectionSort();

    @Test
    public void testPositive(){
        int[] arr = {8, 9, 7, 10, 2};
        int[] Sortedarr = {2, 7, 8, 9, 10};
        assertArrayEquals("Positive numbers sorting failed", Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testNegative(){
        int[] arr = {-1, -5, -3, -4, -2};
        int[] Sortedarr = {-5, -4, -3, -2, -1};
        assertArrayEquals("Negative numbers sorting failed", Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testMixed(){
        int[] arr = {3, -2, 0, -1, 4};
        int[] Sortedarr = {-2, -1, 0, 3, 4};
        assertArrayEquals("Mixed numbers sorting failed", Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testDuplicates(){
        int[] arr = {3, -2, 3, -1, -2};
        int[] Sortedarr = {-2, -2, -1, 3, 3};
        assertArrayEquals("Duplicate numbers sorting failed", Sortedarr, sorter.basicSelectionSort(arr));
    }
}
