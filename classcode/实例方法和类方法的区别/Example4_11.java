import java.util.*;
public class Example4_11{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int []a = {1,46,12,78,65,15,32};
        Arrays.sort(a);//类方法升序排序
        System.out.println(Arrays.toString(a));
        System.out.println("输入整数,判断是否存在于数组中:>");
        int number = reader.nextInt();

        int index = Arrays.binarySearch(a, number);//打印升序排序后的数组并寻找与number大小相等元素的下标
        if(index >= 0)
            System.out.println(number + "和数组中下标为" + index + "的元素相同");
        else
            System.out.println("数组中没有该数字");
    }
} 