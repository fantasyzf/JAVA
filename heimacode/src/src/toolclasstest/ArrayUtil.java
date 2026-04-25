package toolclasstest;

public class ArrayUtil {
    //1.私有化构造方法,不让外界创建变量
    private ArrayUtil() {}

    /*1.提供一个方法printArr,用于遍历数组
        格式如下:[10, 20, 30, 40, 50]
     */
    public static void printArr(int[] arr) {
        System.out.print("[");//没有ln
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.println(arr[i] + "]");
            else
                System.out.print(arr[i] + ", ");//去掉ln
        }
    }

//    2.提供一个方法getAverage,用于返回平均分
    public static double getAverage(int[] arr) {
        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
//      或 return sum * 1.0 / arr.length;
    }
}

