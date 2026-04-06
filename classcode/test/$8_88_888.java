import java.util.Scanner;

public class $8_88_888{
    public static void main(String[] args){

        //要求实现8+88+888...

        //声明变量
        long sum = 0;
        long item = 0;
        int a = 8;
        int i = 0;

        //输入n
        System.out.print("请输入你要计算多少个数相加:>");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        //代码实现
        for(i = 0;i < n;i++)
        {
            //加数
            item = item * 10 + a;
            //求和
            sum = sum + item;
        }

        //输出
        System.out.printf("这是%d个数相加的结果:>",n);
        System.out.println(sum);
    }
}

//错误点:
//1.import 忘写
//2.类名不能8开头
//3.i <= n,多循环一次
//4.item*8错误
