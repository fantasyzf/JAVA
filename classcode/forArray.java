public class forArray{
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        //传统方式遍历数组
        for(int i = 0; i < arr.length; i++){
            System.out.prinln(arr[i]);
        }


        //改进方法遍历数组
        for(int j :arr){
            System.out.println(j);
        }


    }
}


//1.改进方法输出的括号内只能填j