class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        // Count frequency of each digit
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Try all 3-digit even numbers
        for (int num = 100; num <= 999; num++) {

            // Must be even
            if (num % 2 != 0) continue;

            int a = num / 100;        // hundreds place
            int b = (num / 10) % 10;  // tens place
            int c = num % 10;         // units place

            int[] temp = new int[10];
            temp[a]++;
            temp[b]++;
            temp[c]++;

            boolean possible = true;

            // Check if we have enough digits available
            for (int i = 0; i < 10; i++) {
                if (temp[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) count++;
        }

        return count;
    }
}