class Num{
    int x = 0;
    int y = 0;

    void setXY(int m, int n){
        x = m;
        y = n;
    }
}

public class quote{
    public static void main(String[] args) {

        //输出引用

        Num p1 = new Num();
        Num p2 = new Num();

        //带前缀的输出
        System.out.println("带前缀的引用");
        System.out.println("p1的引用:>" + p1);
        System.out.println("p2的引用:>" + p2);

        System.out.println();
        
        //不带前缀的输出
        System.out.println("不带前缀的引用");
        int address = System.identityHashCode(p1);
        System.out.printf("p1的引用%x\n", address);
        address = System.identityHashCode(p2);
        System.out.printf("p2的引用%x\n", address);

        System.out.println();

        p1 = p2;
        System.out.println("p1 = p2后:>");
        address = System.identityHashCode(p1);
        System.out.printf("p1的引用%x\n", address);
        address = System.identityHashCode(p1);
        System.out.printf("p2的引用%x\n", address);


    }
}

//1.%x输出才是十六进制,用println直接输出的话是十进制
//2.class Num前面不加public