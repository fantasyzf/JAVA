
public class work2 {
    public static void main(String[] args) {
        /*
         * 【猜年龄】
         * 
         * 问题描述：
         * 
         * 美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。他曾在1935~1936年应邀来中国清华大学讲学。
         * 
         * 一次，他参加某个重要会议，年轻的脸孔引人注目。于是有人询问他的年龄，他回答说：
         * 
         * “我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。”
         * 
         * 请编程推算一下，他当时到底有多大。
         */

        System.out.print("可推测出他的年龄是:>");
        for (int age = 10; age <= 30; age++) {
            // 1.计算立方和4次方
            long cube = (long) Math.pow(age, 3);
            long fourthpower = (long) Math.pow(age, 4);

            // 2.是否符合条件一和条件二的要求
            // boolean result = (1000 <= cube && cube <= 9999) && (100000 <= fourthpower &&
            // fourthpower <= 999999);
            if (1000 > cube || cube > 9999)// 不符合条件一就跳过
                continue;
            if (100000 > fourthpower || fourthpower > 999999)// 不符合条件二就跳过
                continue;

            // 3.拼接立方和四次方,检查条件三
            String stringsum = String.valueOf(cube) + String.valueOf(fourthpower);
            // 调用类方法
            if (NumberUtils.isTrue(stringsum)) {
                System.out.println(age);
            }
        }
    }
}

/*
 * 1.解决问题前预测大致范围for (int age = 10; age <= 30; age++)
 * 2. if (1000 > cube || cube > 9999) continue;不会运用continue
 * 3.String stringsum = String.valueOf(cube) +
 * String.valueOf(fourthpower);不会拼接两个字符串
 * 4.不会处理VScode包语句报错
 */