//来自豆包
import java.util.Scanner;

//工具类
class GetSum{
    //构造方法
    int getSum(int...x){
        int sum = 0;
        for(int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        //javafor语句遍历
        //for(int i: x){
        //   sum = sum + x[i];
        // }
        return sum;
    }
}

//主类
public class 可变参数{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //输入非整型数结束输入
        System.out.println("请输入整数.输入非整数结束");
        //1.先收集所有输入的整数
        java.util.List<Integer> numList = new java.util.ArrayList<>();
        while(reader.hasNextInt()){
            int num = reader.nextInt();
            numList.add(num);
        }

        //2.把List转成int数组,一次性传给可变参数方法
        int nums[] = numList.stream().mapToInt(i ->i).toArray();
        GetSum getSumobj = new GetSum();//创建工具类对象
        int total = getSumobj.getSum(nums);//调用求和方法
        System.out.println("所有数字和:>" + total);
        reader.close();//关闭资源

    }
}

//1.构造方法无类型
//2.while拼写错误
//3.创建对象的时候用new运算符