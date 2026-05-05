import java.util.Arrays;
import java.util.Scanner;
public class Example2_5 {
   public static void main(String args[]) {
      int a[] = {12,45,67,89,123,-45,67};
      int start=0,end = a.length-1;
      int index = -1;
      for(int i=0; i<end-1; i++) { // 选择法排序   
          index = i;
	  for(int j = i+1; j <= end;j++){
              if(a[j] < a[index]){
                 index = j;
              }
          }
          if(index!=i){
             int temp = a[i];
             a[i] = a[index];
             a[index] = temp; 
          } 
      }
      System.out.println(Arrays.toString(a));
      Scanner scanner = new Scanner(System.in);
      System.out.println("从键盘输入一个数，然后回车"); 
      int number = scanner.nextInt();
      index = -1;
      while(start <= end) {
          int mid = (start+end)/2;
          int midVal = a[mid];
          if(number < midVal){
              end = mid-1;
          }
          else if(number > midVal){
              start = mid+1;
          }
          else {
              index = mid;  //umber和数组中某个元素值相同，保存该元素的索引
              break;
          }
      }
      if(index < 0)
         System.out.printf("%d不在数组中",number);
      else
         System.out.printf("%d在数组中，即和数组（排序后）的第%d个元素的值%d相同\n",number,index,a[index]);
   }
}