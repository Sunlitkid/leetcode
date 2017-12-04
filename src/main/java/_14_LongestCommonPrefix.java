/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class _14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"aca","cba"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static  String longestCommonPrefix(String[] strs) {
        if(strs.length<=0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String prefix = strs[0];
        for(int i=  1 ; i<strs.length;i++){
            prefix = getCommonPrefix(prefix,strs[i]);
            if(prefix.length()==0){
                return  prefix;
            }
        }
        return  prefix;
    }

    private static String getCommonPrefix(String string1,String string2){
        StringBuffer sb = new StringBuffer();
        int length = Math.min(string1.length(),string2.length());
        for(int i = 0 ; i <length;i++){
            if(string1.charAt(i)==string2.charAt(i)){
                sb.append(string1.charAt(i));
            }else{
                return  sb.toString();
            }
        }
        return  sb.toString();
    }
}
