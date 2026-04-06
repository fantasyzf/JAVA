public class Ladder{
    double upperBase = 0.0;
    double height = 0.0;
    static double lowerBase = 0.0;//类变量

    void setHeight(double h){
        height = h;
    }
    void setUpperBase(double a){
        upperBase = a;
    }
    void setLowerBase(double b){
        lowerBase = b;
    }
    double getArea(){
        return (upperBase + lowerBase) * height / 2.0;
    }

    double getHeight(){
        return height;
    }
    double getUpperBase(){
        return upperBase;
    }
    double getLowerBase(){
        return lowerBase;
    }
}