import java.util.Scanner;

class xiaoBao{


    double height = 0.0;
    double weight = 0.0;

    //输出字符串的方法
    void put(String s){
        System.out.println(s);
    }

    //计算BMI的方法
    void BMI(double h,double w){
        h = h / 100;
        w = w / 2;
        double bmi = w / ( h * h );
        System.out.printf("宝宝的BMI:%.2f\n", bmi);
    }

}


public class 使用对象 {
    public static void main(String[] args) {

        //创建对象
        xiaoBao baobao = new xiaoBao();
        baobao.height = 163;
        baobao.weight = 110;


        //输出之前的数据
        baobao.put("小宝之前:>");
        System.out.println(baobao.height);
        System.out.println(baobao.weight);
        baobao.BMI(baobao.height,baobao.weight);
        System.out.println();

        //输入现在的数据
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入身高：");
        baobao.height = reader.nextDouble();
        System.out.print("请输入体重：");
        baobao.weight = reader.nextDouble();
        System.out.println();

        //输出现在数据
        baobao.put("小宝锻炼后:>");
        System.out.println(baobao.height);
        System.out.println(baobao.weight);
        baobao.BMI(baobao.height,baobao.weight);

    }
}
