/**
 * Created by sunke on 2018/1/3.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:

 Input: "babad"

 Output: "bab"

 Note: "aba" is also a valid answer.
 Example:

 Input: "cbbd"

 Output: "bb"
 */
public class _5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaaa"));

    }
    public static String longestPalindrome(String s) {
        int bestStart = 0 ;
        int bestEnd = 0;
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length;i++){
            int j=i+1,k=i-1;
            for(;j<chars.length&&k>=0;j++,k--){
                if(chars[j]!=chars[k]){
                    break;
                }
            }
            if(j-k>bestEnd-bestStart){
                bestEnd = j;
                bestStart = k;
            }
        }
        for(int i = 0 ; i < chars.length;i++){
            int j=i+1,k=i;
            for(;j<chars.length&&k>=0;j++,k--){
                if(chars[j]!=chars[k]){
                    break;
                }
            }
            if(j-k>bestEnd-bestStart){
                bestEnd = j;
                bestStart = k;
            }
        }
        return  s.substring(bestStart+1,bestEnd);
    }
}
