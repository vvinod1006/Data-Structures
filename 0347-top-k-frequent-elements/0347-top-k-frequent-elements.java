class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Store frequencies in an array
        int arr[] = new int[map.size()];
        int count = 0;

        for (Integer x : map.values()) {
            arr[count] = x;
            count++;
        }

        // Step 3: Sort the frequency array
        Arrays.sort(arr);

        // Step 4: Find the top K frequent elements
        int result[] = new int[k];
        count = 0;

        for (Integer x : map.keySet()) {
            if (map.get(x) >= arr[arr.length - k]) {
                result[count] = x;
                count++;

                if (count == k) {
                    break;
                }
            }
        }

        return result;
    }
}