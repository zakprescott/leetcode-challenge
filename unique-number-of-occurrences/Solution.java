
// https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.*;

class Solution {

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