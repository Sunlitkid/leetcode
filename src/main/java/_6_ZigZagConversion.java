/**
 * Created by sunke on 2018/1/4.
 */

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 PSHAIIYLRGPAIN
 PAYPALISHIRING
 */
public class _6_ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
    }
    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        StringBuffer[] buffers = new StringBuffer[numRows];
        for(int i = 0 ; i <numRows;i++){
            buffers[i] = new StringBuffer();
        }
        int index = 0 ;
        while(index<chars.length){
            for(int j = 0 ; j <numRows;j++){
                if(index==chars.length){
                    break;
                }
                buffers[j].append(chars[index]);
                index++;
            }
            for(int j =numRows-2; j>0 ; j--){
                if(index==chars.length){
                    break;
                }
                buffers[j].append(chars[index]);
                index++;
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i< numRows ; i ++ ){
            sb.append(buffers[i]);
        }
        return  sb.toString();
    }

}
