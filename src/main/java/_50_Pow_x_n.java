/**
 * Created by huaching on 2017/8/25.
 */

/**


 Implement pow(x, n).



 */
public class _50_Pow_x_n {

    public static void main(String[] args) {
       // System.out.println(myPow(2,Integer.MIN_VALUE));
        //System.out.println(myPow2(2,Integer.MIN_VALUE));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(-Integer.MAX_VALUE);
    }

    //慢
    public static double myPow(double x, int n) {
        if(n == 0) return 1;

        if(n%2==0){
            return  myPow(x, n / 2) * myPow(x, n / 2);
        }else{
            if(n < 0){
                return  myPow(x, n / 2) * myPow(x, n / 2) * (1 / x);
            }else{
                return myPow(x, n / 2) * myPow(x, n / 2) * x;
            }
        }
    }
    //快
    //Integer.MIN_VALUE--->   -2147483648
    //但是  -Integer.MIN_VALUE  依然等于 -2147483648（原反补等等）
    //当x = 2;n= -2147483648
    //  -n = -2147483648
    //  所以结果错了
    //所以结果为
    public static  double myPow2(double x, int n){
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        if(n%2 == 0){
            return  myPow2(x*x, n/2);
        }else{
            return  x*myPow2(x*x, n/2);
        }
    }

}
