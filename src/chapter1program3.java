import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class chapter1program3 {
    public static void main(String[] args){
        //A program to sum of three numbers in java.
       System.out.println("taking input from user");
        Scanner z = new Scanner(System.in);
        System.out.println("enter a");
        float a = z.nextInt();
        System.out.println("enter b");
        float b = z.nextInt();
        System.out.println("enter c");
        float c = z.nextInt();
        float total = a+c+b;
        System.out.println("sum of a and b= " );
        System.out.println(total);
// Calculate cgpa using mark in three number1
        System.out.println("cgpa of numbers are");
        float cgpa= ((total/3)-7) /10;
        System.out.println(cgpa);
       //asks the user to enter his her name ahd greet them with hello name have a good day
        System.out.println("enter your name ");
        Scanner str =new Scanner(System.in);
String sr = str.nextLine();
       // System.out.println("You are pass");
        System.out.print(sr);
    }

}
