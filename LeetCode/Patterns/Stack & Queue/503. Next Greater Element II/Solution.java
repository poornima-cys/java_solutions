class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize all elements with -1
        
        Stack<Integer> stack = new Stack<>(); // Stores indices of elements
        
        // Traverse the array twice to simulate the circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int currentNum = nums[i % n];
            
            // Maintain a monotonic decreasing stack
            // If current element is greater than the element at the stack's top index,
            // then current element is the Next Greater Element for that top index.
            while (!stack.isEmpty() && nums[stack.peek()] < currentNum) {
                result[stack.pop()] = currentNum;
            }
            
            // Only push indices from the first pass to avoid rewriting or over-processing
            if (i < n) {
                stack.push(i);
            }
        }
        
        return result;
    }
}

    