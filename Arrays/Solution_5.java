package Arrays;

import java.util.*;

// This is a Java program to find the next lexicographical permutation of an array of integers.
// The next permutation is the next greater permutation of the array in lexicographical order.
// If no such permutation exists, the array is sorted in ascending order and the next permutation is the smallest permutation.
// Notes: approach-1: finding the all permutations, (recursion +backtracking)
// approach-2: finding the next permutation in lexicographical order
// first find the smallest number which is greater than the pivot number from the right side of the array.
// then swap the pivot number with the smallest number. finally reverse the array from the pivot+1 to end of the array.
// Time complexity: O(n) for finding the next permutation, O(n) for reversing the array, O(n) for finding the pivot number.
public class Solution_5 {

    void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        reverse(arr, pivot + 1, n - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
