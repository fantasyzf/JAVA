import java.util.Scanner;

public class 拆分三位数 {
    static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int num = reader.nextInt();

        System.out.println("百位：" + num / 100);
        System.out.println("十位：" + num / 10 % 10);
        System.out.println("个位：" + num % 10);
        reader.close();


    }
}
