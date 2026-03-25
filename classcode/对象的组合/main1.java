public class main1 {
    public static void main(String[] args){
        SIM simOne = new SIM (18279243918L);
        MobileTelephone mobile = new MobileTelephone();
        mobile.setSIM(simOne);
        System.out.println("手机号码:" + mobile.lookNumber());
        SIM simTwo = new SIM(18679820140L);
        mobile.setSIM(simTwo);
        System.out.println("手机号码:" + mobile.lookNumber());

    }
}