public class Circle{
    double radius = 0.0;
    double area = 0.0;
    //设置半径
    void setRadius(double r){
        radius = r;
    }
    //半径
    double getRadius(){
        return radius;
    }
    //面积
    double getArea(){
        area = 3.14 * radius * radius;
        return area;
    }
}