import java.util.Scanner;

public class chapter4_program2 {
    public static void main(String[] args) {
  /*      System.out.println("School result");
        Scanner sc = new Scanner(System.in);
        byte eng = sc.nextByte();
        byte hindi = sc.nextByte();
        byte Maths = sc.nextByte();
        System.out.println("english " + eng);
        System.out.println("hindi " + hindi);
        System.out.println("Maths " + Maths);
        float Total =eng+hindi+Maths;
        System.out.println("Total=" +Total);
        float per= Total/3;
        System.out.println("persentage = "+per);
        if(per>=40 && eng>=33 && hindi>=33 && Maths>=33 && per<=100){
            System.out.println("student is pass");
        } else {
            System.out.println("student is fail");
        }*/
        // tax report
        System.out.println("income tex report");
        System.out.println("fill ur income amount");
        Scanner a= new Scanner(System.in);
        float x= a.nextFloat(); //total amount
        //System.out.println(x);
       if(x<250000){
           System.out.println("no need to pay tax");
           System.out.println("your remaining amount is  " + x);
        }
       else if(x<500000){
           float z= x-250000;
           float y = z/20.0f;
           System.out.print("your taxable amount is =>");
           System.out.println(y);
           float b= x-y;
           System.out.println("your remaining amount is  " +b);
               }
       else if(x<1000000){
          float m= x-250000;
          float n = m/5.0f;
           System.out.println("your taxable amount is =>");
           System.out.print(n);
           float c= x-n;
           System.out.println("your remaining amount is  " +c);
       }
       else{
           float m= x-250000;
           float n = m/5.0f;
           float z=n*3/10;
           System.out.println("your taxable amount is =>");
           System.out.print(z);
           float b= x-z;
           System.out.println("your remaining amount is  " +b);
       }
// question
      /*  System.out.println("week given of the number");
        Scanner sc = new Scanner(System.in);
        int days= sc.nextInt() ;
        switch(days){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("thursday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("saturday");
            case 7-> System.out.println("sunday");

        }

        System.out.println("cheek its leap year or not");
        System.out.println("enter the year ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a%4==0){
            System.out.println("this year is leap year");
        }
        else{
            System.out.println("this is not leap year");
     }
      /*      System.out.println("Check the website url");
        System.out.println("enter the website name ");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(a);
        if(a.endsWith(".com")){
            System.out.println("commerical website");
        }
        else  if(a.endsWith(".org")){
            System.out.println("organigation website");
        }
        else  if(a.endsWith(".in")){
            System.out.println("indian website");
        }*/


    }
}
