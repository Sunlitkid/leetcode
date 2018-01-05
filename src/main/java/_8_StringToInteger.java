/**
 * Created by sunke on 2018/1/5.
 */

/**
 * 贼多限制，题目不怎么好
 */
public class _8_StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483649"));
    }
    public static  int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0){
            return  0;
        }
        char[] chars = str.toCharArray();
        int i = 0 ;
        if(chars[0]=='-'){
            for(int j = 1  ; j <chars.length;j++){
                if('0'<=chars[j]&&'9'>=chars[j]){
                    int newI = i *10 - ((int)chars[j]-(int)'0');
                    if(i < Integer.MIN_VALUE / 10 ||(i == Integer.MIN_VALUE / 10 && chars[j] - '0' >8) ){
                        return  Integer.MIN_VALUE;
                    }else{
                        i = newI;
                    }
                }else{
                    break;
                }
            }
        }else{
            int j = 0 ;
            if(chars[0]=='+'){
                j = 1;
            }
            for(; j <chars.length;j++){
                if('0'<=chars[j]&&'9'>=chars[j]){
                    int newI = i *10 + ((int)chars[j]-(int)'0');
                    if(i > Integer.MAX_VALUE / 10 || (i == Integer.MAX_VALUE / 10 &&chars[j] - '0' > 7)){
                        return  Integer.MAX_VALUE;
                    }else{
                        i = newI;
                    }
                }else{
                    break;
                }
            }
        }
        return  i;
    }
}
