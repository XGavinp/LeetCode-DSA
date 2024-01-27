public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] frequencyCount = new int[101];
        
        for (int num : nums) {
            frequencyCount[num]++;
        }
        
        int pairsCount = 0;
        
        for (int frequency : frequencyCount) {
            if (frequency > 1) {
                pairsCount += (frequency * (frequency - 1)) / 2;
            }
        }
        
        return pairsCount;
    }
}