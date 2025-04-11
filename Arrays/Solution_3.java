package Arrays;

import java.util.*;

//  Notes: program to reverse an array
//  Approach: 1. Initialize two pointers, low and high, to the start and end of the array respectively.
//            2. Swap the elements at low and high pointers and increment low pointer and decrement high pointer until low is less than or equal to high.
//  Complexity: O(n) time and O(1) space.

public class Solution_3 {
    public void reverseArray(int arr[]) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
