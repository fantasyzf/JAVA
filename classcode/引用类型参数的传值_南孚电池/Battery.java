public class Battery{
    int electricityAmount = 0;
    //让其他类引用方法给成员变量赋值,而不是用点运算符赋值
    Battery(int amount){
        electricityAmount = amount;
    }

    int getElectricityAmount(){
        return electricityAmount;
    }
}