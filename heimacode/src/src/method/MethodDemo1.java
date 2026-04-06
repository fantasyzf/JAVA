package method;
import java.util.Random;

public class MethodDemo1 {
    public static void main(String[] args) {
        //获取10个1~100之间的随机数并存入到数组中,要求数字不重复

        //1.创建数组
        int []arr = new int [10];
        //2.生成随机数
        Random r = new Random();
        for(int i = 0;i < arr.length; ){
            int num = r.nextInt(100) + 1;
            //对num进行判断,存在---不存入,不存在---存入
            boolean flag = contains(num, arr);

            //对count进行判断
            if(!flag){
                arr[i] = num;
                //只有生成一个满足要求的随机数,索引才会自增
                i++;
            }

        }
        //3.遍历数组输出
        System.out.println("数组元素为:");
        for(int j: arr){
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //定义一个方法,判断num是否在arr中
    public static boolean contains(int num, int []arr){
        for(int i:arr){
            if(i == num){
                //存在
                return true;
            }
        }
        return false;
    }
}

//1.java中增强性遍历数组(int i:arr)中i直接表示元素而不是索引
//2.' '是字符ASCII是32," "是字符串表示空格