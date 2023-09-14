import java.util.Scanner;

public class chapter2program2 {
    public static void main(String[] args) {
        System.out.println("Increment and Decrement Operaters");
       Scanner a = new Scanner(System.in);
       float b = a.nextInt();
        System.out.println(b);
        System.out.println(--b);
        System.out.println(++b);
        System.out.println("x= ++y*8");
        System.out.print("y= ");
        float y= a.nextInt();
        System.out.println(y);
        System.out.println( ++y*8);
        char x= 'b';
        System.out.println(--x);
    }
}
