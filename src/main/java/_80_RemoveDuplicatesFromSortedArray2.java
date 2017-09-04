/**

 Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


 */
public class _80_RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,2,2};
        //removeDuplicates1(nums);
       // System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates1(nums));
        print(nums);

    }

    public  static  int removeDuplicates1(int[] nums) {
        if(nums.length==0){
            return   0;
        }
        if(nums.length==1){
            return   1;
        }
        if(nums.length==2){
            return   2;
        }
        int[] newArr = new int[nums.length];
        int num = nums[0];
        newArr[0]=nums[0];
        int index = 1 ;
        int count = 0 ;
        for(int i =1 ; i<nums.length;i++){
            if(num!=nums[i]){//如果不相等  就放到新串
                newArr[index] = nums[i];
                num = nums[i];
                index++;
                count = 0 ;
            }else{
                if(count>0){//第2次以后的相等，跳过

                }else{//第一次的相等  放到新串
                    newArr[index] = nums[i];
                    index++;
                    count++;
                }
            }
        }
        for(int i = 0 ;i<nums.length ; i++){
            nums[i]= newArr[i];
        }
        return index;
    }
    public  static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return   0;
        }
        if(nums.length==1){
            return   1;
        }
        int length = 1 ;
        int cursor = 0 ;
        int count = 0 ;
        for(int i = 0 ; i<nums.length-1; i++){
            if(nums[cursor]==nums[cursor+1]){
                if(count>0){
                    removeByIndex(cursor,nums);
                }else{
                    count++;
                    cursor++;
                    length++;
                }
            }else{
                count = 0;
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
