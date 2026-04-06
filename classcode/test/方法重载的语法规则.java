class People{
    float hello(int a, int b){
        return a + b;
    }
    float hello(long a, int b){//参数类型不同
        return a - b;
    }
    double hello(double a, int b){//返回类型不参与比较,参数不同才是方法重载
        return a * b;
    }
}
public class 方法重载的语法规则{
   public static void main(String[] args) {
        People test = new People();
        System.out.println(test.hello(10, 20));
        System.out.println(test.hello(10L, 20));
        System.out.println(test.hello(10.0, 20));
    }
}