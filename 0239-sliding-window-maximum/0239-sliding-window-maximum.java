class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // brute force approach
        // int size = nums.length - k + 1;
        // int[] res = new int[size];
        // int max = nums[0];
        // int maxIndex = 0;
        // for (int i = 0; i < k; i++) {
        //     if (nums[i] > max) {
        //         max = nums[i];
        //         maxIndex = i;
        //     }
        // }
        // res[0] = max;
        // int start = 1;
        // int m = 1;
        // for (int j = k; j < nums.length; j++) {
            
        //     if (nums[j] >= max) {
        //         max = nums[j];
        //         maxIndex = j;
        //     }
        //     else if (maxIndex < start) {
        //         max = nums[start];
        //         maxIndex = start;

        //         for (int l = start + 1; l <= j; l++) {
        //             if (nums[l] > max) {
        //                 max = nums[l];
        //                 maxIndex = l;
        //             }
        //         }
        //     }
        //     res[m] = max;
        //     m++;
        // }
        // return res;

        // best approach

        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int start = 0;
        int end = 0;
        int index = 0;
        while (end < nums.length) {
            // Remove elements smaller than current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[end]) {
                deque.removeLast();
            }

            deque.addLast(end);

            // Remove elements which are outside the window
            if (deque.peekFirst() < start) {
                deque.removeFirst();
            }

            // Window size has reached k
            if (end - start + 1 == k) {
                res[index] = nums[deque.peekFirst()];
                index++;
                start++;
            }

            end++;
        }
        return res;
    }
}