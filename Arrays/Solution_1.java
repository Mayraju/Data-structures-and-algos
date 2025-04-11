package Arrays;

import java.util.*;

//  Notes: program to find the second largest element in an array
//  Approach: 1. find the maximum element in the array.
//            2. find the second maximum element in the array by skipping the maximum element.
//  Complexity: O(n) time and O(1) space.

class Solution_1 {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                continue;
            } else {
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        return secondMax;
    }
}
