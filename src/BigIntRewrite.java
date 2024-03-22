// Written By: Austin Barnett
// Written On: 11/15/2019
// Version 1.0

public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger t = pow(x, n / 2);
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(bigX);
        }
    }
}
