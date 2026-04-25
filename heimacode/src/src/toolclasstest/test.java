package toolclasstest;

public class test {
    public static void main(String[] args) {
        /*1.提供一个方法printArr,用于遍历数组
        格式如下:[10, 20, 30, 40, 50]
        * 2.提供一个方法getAverage,用于返回平均分*/

        //创建数组
        int arr[] = {10, 20, 30, 40, 50};
        //遍历
        ArrayUtil.printArr(arr);

        //创建数组
        int[] arr2 = {1, 2, 3, 4, 7};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println("平均分是:" + avg);
    }
}
