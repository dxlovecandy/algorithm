/**
 * create time:2019/2/1 14:12
 *
 * @author dengwei
 */

public class BinarySearch {

    private static final int ARRAY_SIZE = 100;

    public int binarySearch(int[] array,int item) {
        int low = 0;
        int high = array.length-1;
        if (array.length<=0) {
            return -1;
        }
        if (array.length==1) {
            if (array[array.length-1]==item) {
                return array.length-1;
            }
        }
        while (low<=high) {
            int middle = (low+high)/2;
            int guess = array[middle];
            if (guess == item) {
                return middle;
            }
            else if (guess>item) {
                high = middle-1;
            } else {
                low = middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int index = 1;index<=ARRAY_SIZE;index++) {
            array[index-1] = index;
        }

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(array,2));
    }
}
