import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 1, 2, 2, 1, 1, 3 };
        boolean result = s.uniqueOccurrences(nums);
        System.out.println(result);
    }

    public boolean uniqueOccurrences(int[] arr) {
        boolean isUnique = false;
        HashMap<Integer, Integer> numToOccurrences = new HashMap<Integer, Integer>();

        for (int num : arr) {
            if (numToOccurrences.containsKey(num)) {
                int value = numToOccurrences.get(num);
                numToOccurrences.put(num, ++value);
            } else {
                numToOccurrences.put(num, 1);
            }
        }

        Collection<Integer> occurrences = numToOccurrences.values();
        Set<Integer> uniqueOccurrences = new HashSet<Integer>(occurrences);

        if (occurrences.size() == uniqueOccurrences.size()) {
            isUnique = true;
        }

        return isUnique;
    }
}