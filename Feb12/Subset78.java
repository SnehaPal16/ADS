// package Feb12;

import java.util.ArrayList;
import java.util.List;

public class Subset78 {
    public static void generateSubset(int[] nums , int index , List<Integer> curr , List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));

        for(int i=index ; i<nums.length ; i++){
            curr.add(nums[i]);
            generateSubset(nums , i+1 , curr , ans);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubset(nums , 0 , new ArrayList<>() , ans);

        return ans;
    }


    public static void main(String[] args) {
        
    }
}
