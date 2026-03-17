public class PrimeNum{
    public static void main(String[] args){

        //输出100以内的素数

        for(int i = 0; i <= 100; i++){
            //打印素数
            if(IsPrime(i)){
                System.out.printf("%d ", i);
            }
        }

    }
    //判断素数
    public static boolean IsPrime(int n){

        //排除0和1
        if(n == 0 || n == 1){
           return false;
        }


        for(int i = 2; i < n; i++){
            if(n % i == 0)
               return false;
        }

        return true;
    }

}