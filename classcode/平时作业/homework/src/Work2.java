import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        /*编写程序求小于N的最大素数
        * 要求:输入一个正整数N(N>2),
        * 程序经分析处理输出小于N的最大素数*/

        //1.输入
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();

        //2.计算小于N的最大素数
        MaxPrime max = new MaxPrime();
        int result = max.getMaxPrime(N);

        //3.输出最大素数结果
        System.out.println(result);
    }
}
