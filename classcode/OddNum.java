import java.util.Scanner;

public class OddNum{
    public static void main(String[] args){

        //计算1+3+5+7+9

        //声明成员变量
        int sum = 0;
        int i = 0;

        //输入n
        System.out.print("请输入n,计算0-n的素数和:>");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        //计算
        for(i = 1;i <= n;){
            //求和
            sum = sum + i;
	        i = i + 2;
        }

        //输出
        System.out.printf("和为:>%d",sum);
    }
}

//错误点:
//1.最好不要中文命名类
//2.i = i + 2;要在sum之前
