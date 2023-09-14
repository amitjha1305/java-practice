import java.sql.SQLOutput;
import java.util.Scanner;

public class chapter3_program3 {
    public static void main(String[] args) {
        System.out.println("chapter3_program3");
        System.out.println(" Q1.convert into lower case.");
       Scanner a= new Scanner(System.in);
       String B= a.nextLine();
        System.out.println(B.toLowerCase());

        System.out.println(" Q2.convert space into upperspace.");
        B =B.replace(' ','_');
        System.out.println(B);

        System.out.println("Q.3");
        String text = "dear <|name|> Thanks a lots!";
        text = text.replace("<|name|>",B);
        System.out.println(text);

        System.out.println("Q.4");

String  x= "i am   a boy   she  is my  my life.";
        System.out.println(x.indexOf(" "));
        System.out.println(x.indexOf("  "));
        System.out.println(x.indexOf("   "));
        System.out.println(x.indexOf("    "));

        System.out.println("Q.5");
        System.out.println("dear amit \n \tI hope u are well. I wrote this letter to inform u have to complete ur java program with is 1 month\n " +
                "\t your caring friend brain" );
    }

    }
