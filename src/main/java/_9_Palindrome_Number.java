/**
 * Created by sunke on 2017/11/28.
 */

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class _9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
