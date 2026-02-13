import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new TreeSet<>(); 
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) continue;
                    if (digits[i] == 0) continue;
                    if (digits[k] % 2 != 0) continue;
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(number);
                }
            }
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}