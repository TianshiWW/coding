package leetcode.app;

import leetcode.implementations.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test = {3,2,3,1,2,4,5,5,6};
        QuickSort quickSort = new QuickSort();

//        System.out.println(Arrays.toString(quickSort.sort(test)));
//        System.out.println("ok");
        System.out.println(quickSort.findKthLargest(test, 4));
    }
}
