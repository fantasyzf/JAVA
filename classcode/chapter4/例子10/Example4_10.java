public class Example4_10 {
    public static void main(String args[]) {
        Ladder.lowerBase = 100; //Ladder 的字节码被加载到内存,通过类名操作类变量
        Ladder ladderOne = new Ladder();
        Ladder ladderTwo = new Ladder();
        ladderOne.setUpperBase(28);
        ladderTwo.setUpperBase(66);
        System.out.println("ladderOne 的上底:"+ladderOne.getUpperBase());
        System.out.println("ladderOne 的下底:"+ladderOne.getLowerBase());
        System.out.println("ladderTwo 的上底:"+ladderTwo.getUpperBase());
        System.out.println("ladderTwo 的下底:"+ladderTwo.getLowerBase());
    }
}