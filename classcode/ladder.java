import java.util.Scanner;

class data{
    double above = 0.0;   //上底
    double bottom = 0.0;  //下底
    double height = 0.0;  //高

    //面积
    double area(){
        return (above + bottom) * height / 2;
    }
}

public class ladder{
    public static void main(String[] args){
        data lad = new data();

        lad.above = 10;
        lad.bottom = 12;
        lad.height = 5;
        double area = lad.area();

        System.out.printf("梯形的面积是:>%.2f\n", area);
        System.out.println();

        //输入数据计算
        System.out.println("请输入梯形的数据:>");
        Scanner reader = new Scanner(System.in);
        System.out.printf("上底");
        lad.above = reader.nextDouble();
        System.out.printf("下底");
        lad.bottom = reader.nextDouble();
        System.out.printf("高");
        lad.height = reader.nextDouble();
        area = lad.area();
        System.out.printf("梯形的面积是:>%.2f\n", area);

    }
}