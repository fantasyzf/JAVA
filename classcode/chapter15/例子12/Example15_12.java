import java.util.*;
import java.util.stream.Collectors;
public class Example15_12 {
    public static void main(String[] args) {
        int array[] = {13,13,100,89,256,36,3, 3,16};
        // 计算最大值
        int max = Arrays.stream(array).max().getAsInt();
        // 计算最小值
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(Arrays.toString(array) + " 的最大值: " + max);
        System.out.println(Arrays.toString(array) + " 的最小值: " + min);
        // 使用 stream() 方法过滤出偶数，计算偶数的平方根，并将结果收集到一个新的数组中 
        double result[]  = Arrays.stream(array)
               .filter(n -> n%2 == 0)
               .mapToDouble(n -> Math.sqrt(n))
               .toArray();
        // 输出偶数平方根的数组
        System.out.println("偶数的平方根列表: " + Arrays.toString(result));
        // 去除数组中重复的数据（但不改变数组 array 元素）
        System.out.print("去除重复数据后的元素: ");
        Arrays.stream(array).distinct().forEach(v -> System.out.print(v + " "));
        System.out.println();
        // 排序数组（但不改变数组 array 元素）
        int[] sorted = Arrays.stream(array).sorted().toArray();
        System.out.println("排序后的数组: " + Arrays.toString(sorted)); 
        List<Integer> numbers = new ArrayList<>();
        numbers.add(49);
        numbers.add(36);
        numbers.add(16);
        numbers.add(256);
        System.out.println("numbers:"+numbers);
        System.out.println("输出偶数平方根: " );
        numbers.stream().filter(n -> n % 2 == 0)
                                    .mapToDouble(n -> Math.sqrt(n))
                                    .forEach(v -> System.out.print(v + " "));
        double sum = numbers.stream().filter(n -> n >=20)
                                    .mapToDouble(n -> Math.sqrt(n)).sum();
        System.out.println("\n大于20的平方根的sum: " +sum);

    }
}