import java.util.Scanner;
public class chapter4_program1 {
       public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
           //    conditional operater if - else
           //    logical operater && ,|| and etc
           int n = scan.nextInt();
           System.out.println(n);
          if(n%2 ==0 && n>=21||n<=5) {
              System.out.println("Correct");
          }
              else{
                  System.out.println("wrong");
              }
       }
    }

