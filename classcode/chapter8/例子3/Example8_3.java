public class Example8_3 {
    public static void main(String args[]) {
        double d = 12295.19751229;
        String strDouble =String.valueOf(d);   //根据double数中的数字和小数点得到String对象
        int indexDot = strDouble.indexOf("."); //得到小数点的索引位置
        String integerPart = strDouble.substring(0,indexDot);     //得到整数部分的字符串
        String fractionalPart = strDouble.substring(indexDot+1);  //得到小数部分的字符串
        System.out.println(d+"的整数部分是"+integerPart+
                           ",长度是"+integerPart.length());
        System.out.println(d+"的小数部分是"+fractionalPart+
                           ",长度是"+fractionalPart.length());
        String str = "abcdefg";
        System.out.print("向左旋转1次字符串"+str+"的新字符串(注意原字符串没有变化):");
        System.out.println(rotateLeft(str));
        System.out.print("向左旋转3次字符串"+str+"的新字符串(注意原字符串没有变化):");
        System.out.println(rotateLeftK(str,3));
        String [] a={"melon","apple","pear","banana"};
    }
    public static String rotateLeft(String str){          //向左旋转1次str得到新的字符串
         String rotatedStr = str.substring(1) + str.charAt(0);
         return rotatedStr;
    }
    public static String rotateLeftK(String str,int k){   //向左旋转k次str得到新的字符串
         int n = str.length();
         k = k%n;                                         //最多旋转str.length()次
         String rotatedStr = str.substring(k) + str.substring(0,k);  
         return rotatedStr;
    }
}
