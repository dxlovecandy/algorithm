/**
 * create time:2019/2/12 14:16
 *
 * @author dengwei
 */

public class QuickSort {

    private int[] array = new int[] { 5, 7, 3, 20, 15, 35, 9 };

    public void quickSort() {
        int len = array.length;
        recQuickSort(0, len - 1);
    }

    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = array[ right ];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (array[ ++ leftPtr ] < pivot) {

            }
            while (rightPtr > 0 && array[ -- rightPtr ] > pivot) {

            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    public void swap(int dex1, int dex2) {
        int temp = array[ dex1 ];
        array[ dex1 ] = array[ dex2 ];
        array[ dex2 ] = temp;
    }
}
