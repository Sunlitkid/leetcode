import java.util.*;

/**
 * Created by huaching on 2017/9/1.
 */
public class _15_3Sum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List<List<Integer>> list= threeSum(nums);
        System.out.println(list);
    }
    public   static  List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length ;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(length<3){
            return list;
        }
        for(int i = 0 ; i<length-2 ;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return list;
    }
}
