
public class NumberUtils {
    public static boolean isTrue(String stringsum) {
        // 1.长度必须是10(健壮性)
        if (stringsum == null || stringsum.length() != 10)
            return false;

        // 2.0~9是否都出现过
        boolean[] seen = new boolean[10];// 默认初始化为false

        for (int i = 0; i < stringsum.length(); i++) {
            char c = stringsum.charAt(i);

            // 如果该数字已经出现过,则返回false
            int index = c - '0';
            if (seen[index]) {// 出现过则seen[index]为ture
                return false;
            }
            // 标记已出现
            seen[index] = true;
        }
        // 如果循环结束没有返回false则满足条件
        return true;
    }
}
/*
 * 1. public static boolean漏掉返回值类型boolean
 * 2.不了解boolean数组的初始化
 * 3.int index = c - '0';不会合理运用ACSII值
 * 4.char c = stringsum.charAt(i);用字符变量接收字符对象stringsum中的字符
 */
