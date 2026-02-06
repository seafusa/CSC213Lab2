import java.math.*;
import java.math.BigInteger;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Lab 2 !");
        double logofzero = Math.log(0);
        System.out.println(logofzero);
        int x = 2000000000;
        int y = 2000000000;
        int z = x + y;
        System.out.println(z);
        BigInteger bx= new BigInteger("2000000000");
        BigInteger by= new BigInteger("2000000000");
        BigInteger sumlarge = bx.add(by);
        System.out.println( sumlarge );

    }
}
