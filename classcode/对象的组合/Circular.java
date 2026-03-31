public class Circular{
    Circle bottom;//空对象
    double height = 0.0;
    void setBottom(Circle c){//采用封装形式设置圆锥底是一个Circle对象,而不是直接给bottom分配变量
        bottom = c;//bottom和c同为Circle类,bottom接收c的引用,和c一样拥有相同的实体
    }

    void setHeight(double h){
        height = h;
    }

    //计算圆锥的体积
    double getVolume(){
        if(bottom == null)
            return -1;
        else
            return bottom.getArea() * height / 3.0;
    }

    double getBottomRadius(){
        return bottom.getRadius();
    }

    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}