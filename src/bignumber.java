
import java.math.BigInteger;
import java.util.Scanner;

public class bignumber {
    public static void main(String[] args){
        System.out.println("big number");
        Scanner sc= new Scanner(System.in);
        String first= sc.next();
        String second = sc.next();
        BigInteger A,B,C;
        A= new BigInteger(first);
        B = new BigInteger(second);
        C = A.multiply(B);
        System.out.println(C);
    }
}
