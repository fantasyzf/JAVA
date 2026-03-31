public class Example4_8{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        Circular circular = new Circular();
        System.out.println("circle对象的引用:>" + circle);
        System.out.println("圆锥的bottom的引用:>" + circular.bottom);
        System.out.println();
        circular.setHeight(5);

        circular.setBottom(circle);
        System.out.println("circle对象的引用:>" + circle);
        System.out.println("圆锥的bottom的引用:>" + circular.bottom);
        System.out.printf("圆锥的体积:>%.2f\n", circular.getVolume());
        System.out.println();

        System.out.println("修改circle的半径,bottom的半径也同样会改变");
        circle.setRadius(20);
        System.out.println("bottom的半径:>" + circular.getBottomRadius());//circular.bottom.getRadius()也可以
        System.out.println();

        System.out.println("重新创建circle,circle的引用将会发生变化");
        circle = new Circle(); //不用再次声明了
        System.out.println("circle对象的引用:>" + circle);
        System.out.println("但是不会影响bottom的引用");
        System.out.println("圆锥的bottom的引用:>" + circular.bottom);
        
    }
}