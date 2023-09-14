import java.util.Scanner;

public class main{
public static void main(String[] args){
     //my first program
     System.out.println("helloworld");
     /* second program */
     byte a = 23;
     byte b =12;
     System.out.println(a);
     System.out.println(b);
     System.out.println("sum of a and b");
     System.out.println(a+b);


     //check no is odd or even without use %
     Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
     int ans = input/2;
     System.out.println(ans);
     System.out.println(ans*2);
     if(input==ans*2){
          System.out.println("even ");
     }
     else {
          System.out.println("odd");
     }
 }
}
