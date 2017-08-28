/**
 * Created by huacing on 2017/8/25.
 */

/**


 4. Median of Two Sorted Arrays
         There are two sorted arrays nums1 and nums2 of size m and n respectively.
         Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

         Example 1:
         nums1 = [1, 3]
         nums2 = [2]

         The median is 2.0
         Example 2:
         nums1 = [1, 2]
         nums2 = [3, 4]

         The median is (2 + 3)/2 = 2.5
 *
 *
 *
 */
public class _4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,2};
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if((nums1.length+nums2.length)%2==1){
            int indexMid = (nums1.length+nums2.length)/2+1;
            int indexValue = 0;
            int index1 = 0;
            int index2 = 0;
            for(int i = 0 ;i<indexMid;i++){
                if(index1==nums1.length){
                    indexValue =nums2[index2];
                    index2++;
                    continue;
                }
                if(index2==nums2.length){
                    indexValue =nums1[index1];
                    index1++;
                    continue;
                }
                if(nums1[index1]<=nums2[index2]){
                    indexValue =nums1[index1];
                    index1++;
                }else{
                    indexValue =nums2[index2];
                    index2++;
                }
            }
            return (double)indexValue;
        }else{
            int indexMid = (nums1.length+nums2.length)/2;
            int indexValue1 =0;
            int indexValue2 =0;
            int index1 = 0;
            int index2 = 0;
            for(int i = 0 ;i<indexMid;i++){
                if(index1==nums1.length){
                    indexValue1 =nums2[index2];
                    index2++;
                    continue;
                }
                if(index2==nums2.length){
                    indexValue1 =nums1[index1];
                    index1++;
                    continue;
                }
                if(nums1[index1]<=nums2[index2]){
                    indexValue1 =nums1[index1];
                    index1++;
                }else{
                    indexValue1 =nums2[index2];
                    index2++;
                }
            }
            if(index1==nums1.length){
                indexValue2 =nums2[index2];
            }else if(index2==nums2.length){
                indexValue2 =nums1[index1];
            }else {
                if(nums1[index1]<=nums2[index2]){
                    indexValue2 =nums1[index1];
                }else{
                    indexValue2 =nums2[index2];
                }
            }

            return ((double)(indexValue1+indexValue2))/2;

        }

    }
}
