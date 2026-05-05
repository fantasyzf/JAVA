public class Ladder {
    double upperBase, height; //实例变量,upperBase 代表梯形的上底，height 代表梯形的高
    static double lowerBase;  //类变量,lowerBase 代表梯形的下底
    void setUpperBase(double a) {
         upperBase = a;
    }
    void setLowerBase(double b) {
        lowerBase = b;
    }
    double getUpperBase() {
        return upperBase;
    }
    double getLowerBase() {
        return lowerBase;
    }
}
