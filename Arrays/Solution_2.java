package Arrays;

import java.util.*;

//  Notes: program to push all zeros to the end of the array
//  Approach: 1. Traverse the array and find the first zero element and store its index in a variable index.
//            2. Traverse the array again and if the current element is not zero and index is not -1, swap the current element with the element at index and increment index by 1.
//  Complexity: O(n) time and O(1) space.

class Solution_2 {
    void pushZerosToEnd(int[] arr) {
        // code here
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (index == -1 && arr[i] == 0) {
                index = i;
            } else {
                if (index != -1 && arr[i] != 0) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                    index++;
                }
            }
        }
    }
}
