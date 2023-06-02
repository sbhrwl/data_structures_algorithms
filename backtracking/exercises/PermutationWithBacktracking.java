import java.util.ArrayList;
import java.util.List;

class PermutationWithBacktracking {
    public void backtrack (List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() ==nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i=0; i<nums.length; i++) {
            if (temp.contains (nums [i])) 
                continue;
            temp.add (nums[i]);
            backtrack (result, temp, nums); 
            temp.remove (temp.size()-1);
        }
    }

    public List<List<Integer>> permute (int[] nums) { 
        List<List<Integer>> result = new ArrayList<>(); 
        backtrack (result, new ArrayList<Integer>(), nums); 
        return result;
    }
}