/**
 * Created by sunke on 2018/1/15.
 */
public class _53_MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-1};
        System.out.println(maxSubArray(arr));
    }
    public static  int maxSubArray(int[] nums) {
        int maxSum = -2147483648 ;
        for(int i = 0 ;i <nums.length ; i ++){
            int maxSumSubArray = -2147483648;
            int sum = 0 ;
            for(int j = i ; j<nums.length ;j++){
                sum = sum + nums[j];
                if(maxSumSubArray <sum ){
                    maxSumSubArray = sum;
                }
            }
            if(maxSum<maxSumSubArray){
                maxSum = maxSumSubArray;
            }
        }
        return maxSum;
    }
}
