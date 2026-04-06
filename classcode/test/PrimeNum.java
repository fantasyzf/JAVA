public class PrimeNum{
    public static void main(String[] args){

        //输出100以内的素数

        for(int i = 2; i <= 100; i++){
            //打印素数
            if(IsPrime(i)){
                System.out.printf("%d ", i);
            }
        }

    }
    //判断素数
    public static boolean IsPrime(int n){

        for(int i = 2; i < n / 2; i++){
            if(n % i == 0)
               return false;
        }

        return true;
    }

}


//1.true写错
//2.false写错
//3.IsPrime不能写在main方法里