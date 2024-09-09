package algo.dp;

public class MaxSubArray {
    //Kadane algo
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArrayQuadraticTimeComplexity(nums));
        System.out.println(maxByDP(nums));
    }

    private static int maxByDP(int[] nums) {
        int max = nums[0];
        int[] curr = nums.clone();
        for (int i = 1; i < curr.length; i++) {
            curr[i] = Math.max(curr[i], curr[i] + curr[i - 1]);
            max = Math.max(max, curr[i]);
        }
        return max;
    }

    private static int maxSubArrayQuadraticTimeComplexity(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
