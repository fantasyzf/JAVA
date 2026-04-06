public class Example4_10{
    public static void main(String[] args) {
        Ladder.lowerBase = 100;//类名调用
        Ladder ladder = new Ladder();
        ladder.setUpperBase(28);
        ladder.setHeight(5);
        double area = ladder.getArea();
        System.out.printf("梯形的面积:>%.2f\n", area);
        System.out.println("梯形的下底(类名调用):>" + Ladder.lowerBase);
        System.out.println("梯形的下底(方法调用):>" + ladder.getLowerBase());
    }
}

//1.'+'链接符
//2.类名调用类变量,类名是Ladder不是ladder