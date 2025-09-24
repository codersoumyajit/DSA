
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterElements = new int[nums2.length];
        Stack<Integer> helperStack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            while (!helperStack.isEmpty() && helperStack.peek() <= element) {
                helperStack.pop();
            }

            if (helperStack.isEmpty())
                nextGreaterElements[i] = -1;
            else
                nextGreaterElements[i] = helperStack.peek();

            helperStack.push(element);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGreaterElements[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
