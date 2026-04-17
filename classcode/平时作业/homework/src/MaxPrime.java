public class MaxPrime {
    int getMaxPrime(int n) {
        //1.检查边界
        if (n <= 2) {
            return -1;
        }

        //2.从n-1开始遍历找最大素数
        for (int i = n - 1; i >= 2; i--) {
            //判断当前i是否为素数
            if (isPrime(i)) {
                return i;
            }
        }

        //3.没有素数
        return -1;
    }
    //素数判断
    boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
