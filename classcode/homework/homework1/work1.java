import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        /*
         * 【统计字符串中每个字母的出现次数】
         * 
         * 编写一个程序，统计在忽略字母大小写的情况下，字符串中每个字母出现的次数。字符串从键盘上输入。
         * 
         * 【提示】从键盘输入常用的方法如下：
         * 
         * nextBoolean()、nextByte()、nextShort()、nextInt()、nextLong()、nextFloat()、
         * nextDouble()、next()、nextLine()。
         */

        // 1.输入
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入一个字符串:>");
        String input = reader.nextLine();
        System.out.println("--------------------");

        // 2.将输入里的大写字母转换成小写
        String lowerInput = input.toLowerCase();

        // 3.定义一个数组存储26个字母出现的次数(字母a对应count[0],字母z对应count[25])
        int[] count = new int[26];// 数组长度为26,下标是0-25

        // 4.遍历输入的字符串,统计字母出现次数
        for (int i = 0; i < input.length(); i++) {// input.length()这里也可以用lowerInput.length
            char c = lowerInput.charAt(i);// 返回index为i对应的字符

            // 判断字母
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';// 利用ASCII码计算
                count[index]++;
            }
        }

        // 5.输出结果
        System.out.println("统计结果:>");
        for (int i = 0; i < count.length; i++) {
            // 输出次数大于1的字母
            if (count[i] > 0) {
                char letter = (char) ('a' + i);// 还原成字母,如count[0]还原成a
                System.out.println(letter + ":" + count[i]);// letter是char型,打印出来是字符不是ASCII码值
            }
        }
    }
}

/*
 * 1. System.in漏写
 * 2.不熟悉String类中方法:>input.toLowerCase()转换的大小写,其中L为大写
 * 3.i < input.length()不用-1,是小于号
 * 4.非字母字符（数字、标点、空格）在 toLowerCase 后保持原样，长度不变.
 */