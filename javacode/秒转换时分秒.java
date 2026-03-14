import java.util.Scanner;

public class 秒转换时分秒 {
    public static void main(String[] args) {

        //输入
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入秒数：");
        int second = reader.nextInt();

        //拆分
        int hour = second / 3600;
        int mintue = (second - hour * 3600) / 60;
        second = second - hour * 3600 - mintue * 60;

        //输出
        System.out.println(hour + ":" + mintue + ":" + second);


    }
}
