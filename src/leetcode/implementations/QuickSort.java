package leetcode.implementations;

import java.util.Arrays;

public class QuickSort {
    public int[] sort(int[] sourceArr) {
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);
        quickSort(arr, 0, sourceArr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int left, int right) {
        int start = left;
        int end = right;
        if (left < right && left >= 0 && right < arr.length) {
            int pivot = arr[left];
            while (left < right) {
                while (left < right && arr[right] >= pivot) {
                    right--;
                }
                while (left < right && arr[left] <= pivot) {
                    left++;
                }
                if (left < right) {
                    swap(arr, left, right);
                }

            }
            arr[start] = arr[left];
            arr[left] = pivot;
            quickSort(arr, start, left - 1);
            quickSort(arr, left + 1, end);
        }
    }

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(0, nums.length - 1, nums.length - k + 1, nums);
    }

    private int quickSelect(int left, int right, int k, int[] nums) {
        int pivot = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            while (i < j && nums[i] <= pivot) {
                i++;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        nums[left] = nums[i];
        nums[i] = pivot;
        if (i + 1 == k) {
            return pivot;
        } else if (i + 1 < k) {
            return quickSelect(i + 1, right, k, nums);
        } else {
            return quickSelect(left, i - 1, k, nums);
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
