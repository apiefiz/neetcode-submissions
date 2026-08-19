class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate for the fixed element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            Set<Integer> seen = new HashSet<>();
            int target = -nums[i];

            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], complement, nums[j]);
                    resultSet.add(triplet);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(resultSet);
    }
}
