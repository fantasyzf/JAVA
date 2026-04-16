package method;

public class MethodDemo5 {
    public static void main(String[] args){
        /*方法重载*/

        int a = 10;
        int b = 20;
        System.out.println(getSum(a,b));
    }
    public static int getSum(int a,int b){
        return a + b;
    }
    public static double getSum(double a,double b){
        return a + b;
    }
    public static double getSum(int a,double b){
        return a + b;
    }
    public static double getSum(double a,int b){
        return a + b;
    }

}

//java中有隐式转换,但是遇到两个都要转换时就会报错如上