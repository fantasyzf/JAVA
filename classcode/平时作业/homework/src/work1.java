public class work1 {
    /*已知今天是星期六,请问2022天后是星期几?
     * 用数字0到6表示星期日到星期六*/
    /*数学提示:
     * 1.(a + b) / c的余数等于a / c, b / c的余数之和
     * 2.a * b / c的余数,等于a / c, b / c的余数之积*/
    public static void main(String[] args) {
        //1.记录今天是星期六
        int today = 6;

        //2.2022天后是星期几
        int after = (today + 2022 % 7) % 7;

        switch (after) {
            case 0:
                System.out.println("星期日");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
        }
    }
}

