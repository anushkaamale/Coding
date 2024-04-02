import java.util.HashMap;
import java.util.Map;

 class TwoSumIndices {
    
    public static int[] findIndices(int[] nums, int target) {
   
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement is in the map, we found the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, put the element and its index into the map
            map.put(nums[i], i);
        }
        
        // If no solution found, return {-1, -1}
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] indices = findIndices(nums, target);
        
        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("Indices of the elements whose sum is equal to " + target + ": " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }
}
