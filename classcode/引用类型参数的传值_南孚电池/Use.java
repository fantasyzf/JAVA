public class Use{
    public static void main(String[] args) {
        Battery nanfu = new Battery(100);//给自定义构造方法赋值,Battery(int amount)
        System.out.println("南孚电池的储电量是" + nanfu.electricityAmount);
        Radio radio = new Radio();
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(nanfu);//void openRadio(Battery battery)
        System.out.println("目前南孚电池的储电量是:" + nanfu.electricityAmount);//battery改变electricityAmount,nanfu的实体也改变了
    }
}

//1.单词拼写错误