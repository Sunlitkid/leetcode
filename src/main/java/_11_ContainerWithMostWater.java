import java.util.ArrayList;
import java.util.List;

/**
 *
 Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 Note: You may not slant the container and n is at least 2.

 */
public class _11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = new int[15000];
        for(int i = 0 ;i <15000;i++){
            arr[i]=i;
        }
                System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        if(height.length<2){
            return  0;
        }
        int area = 0;
        int left = 0 ;
        int right =height.length-1;
        while(left!=right){
            int newArea = area(height[left],height[right],left,right);
            System.out.println(newArea);
            if(newArea>area){
                area=newArea;
            }
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return area;
    }
    public static int area(int ai1,int ai2 ,int i1,int i2){
        return  Math.min(ai1,ai2)*(i2-i1);
    };
}
