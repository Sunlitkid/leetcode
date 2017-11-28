/**
 * Created by sunke on 2017/11/28.
 */

/**
 * Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 123
 Output:  321
 Example 2:

 Input: -123
 Output: -321
 Example 3:

 Input: 120
 Output: 21
 Note:
 Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class _7_Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(153423646+reverse(153423646));
    }
    public static int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }
    public static int reverse_(int x) {
        long xx= (long)x;
        StringBuffer sb = new StringBuffer();
        if(xx<0){
            sb.append("-");
            xx=-xx;
        }
        while(xx!=0){
            sb.append(xx%10);
            xx=xx/10;
        }
        String string = sb.toString();
        try{
            return  Integer.parseInt(string);
        }catch (Exception e){
            return  0;
        }

    }
}
