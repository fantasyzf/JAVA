public class Radio{
    //把主类中nanfu的引用赋给同类battery对象
    //这样battery就有了nanfu完全相同的实体
    void openRadio(Battery battery){
        battery.electricityAmount = battery.electricityAmount - 10;
    }
}