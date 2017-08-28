/**

 Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


 */
public class _26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,4,4};
        //removeDuplicates1(nums);
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums));
        print(nums);

    }

    public  static  int removeDuplicates1(int[] nums) {
        int[] newArr = new int[nums.length];
        int num = nums[0];
        newArr[0]=nums[0];
        int index = 1 ;
        for(int i =0 ; i<nums.length;i++){
            if(num!=nums[i]){
                newArr[index] = nums[i];
                num = nums[i];
                index++;
            }
        }
        for(int i = 0 ;i<nums.length ; i++){
            nums[i]= newArr[i];
        }
        return index;
    }
    public  static int removeDuplicates(int[] nums) {
        int[] newArr = new int[nums.length];
        if(nums.length==0){
            return   0;
        }
        if(nums.length==1){
            return   1;
        }
        int length = 1 ;
        int cursor = 0 ;
        for(int i = 0 ; i<nums.length-1; i++){
            if(nums[cursor]==nums[cursor+1]){
                removeByIndex(cursor,nums);
            }else{
                cursor++;
                length++;
            }
        }
        return  length;
    }


    static void    removeByIndex(int index,int[] nums){
        int cursor = 0 ;
        for(int  i = 0; i<nums.length;i++){
            if(i==index){
            }else{
                nums[cursor] = nums[i];
                cursor++;
            }
        }
    }

     static void print(int[] nums){
        for(int i = 0 ; i<nums.length ;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}
