/**
 * Created by sunke on 2017/11/28.
 */

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class _9_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }
    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);

    }

    ///ERROR  System.out.println(isPalindrome2(1000021));
    public static boolean isPalindrome2(int x) {
        if(x<0){
            return  false;
        }
        while(x>9){
            int y = (int)(x / Math.pow(10,(int)Math.floor(Math.log10(x))));
            if(y!=x%10){
                return  false;
            }
            x = x%(int)Math.pow(10, (int)Math.floor(Math.log10(x)));
            x=  x/10;
        }
        return  true;
    }
}
