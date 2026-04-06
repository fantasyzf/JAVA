public class relativeTestmain{
    public static void main(String[] args) {
        relativeTest ract = new relativeTest();
        ract.length = 20;
        ract.width = 12;
        double S = ract.area();
        System.out.printf("矩形的面积是%.2f\n", S);
    }
}

//javac relativeTestmain.java会自动编译同文件夹下的用到的relativeTest.java文件,并产生relativeTest.class和relativeTestmain.class