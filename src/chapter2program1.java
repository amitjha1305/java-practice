import java.util.Scanner;

public class chapter2program1 {
    public static void main(String[] args){
      /*
       int a= 12;
       int b=11+a;
        System.out.println(b); // arithmetic operators
        int c= a%3;
        System.out.println(c);// Moduloles operator
        int d= b+=c;
        System.out.println(d);//Assignment operators
        System.out.println(b==d);//comparision operators
        System.out.println(b>a && d>a);  //Logical operators
        System.out.println(b>a || c>a);
              System.out.println(b>a && c>a);
        System.out.println(2&3);         //B itwise operators

        //Precedence and Associativity
        float e= 100/10-5*6;
        System.out.println(e);
        float f = 5*6-100/10;
        System.out.println(f);
        */
        // Quick Quiz
        // Q.1
        Scanner S= new Scanner(System.in);
        System.out.println("(x-y)/2");
        float x=S.nextFloat();
        float y=S.nextFloat();
        float g =(x-y)/2;
        System.out.println(g);

        //Q.2
        System.out.println("(b*b -4*a*c)/2*a");
        float a=S.nextFloat();
        float b=S.nextFloat();
        float c=S.nextFloat();

        float h=(b*b -4*a*c)/2*a;
        System.out.println(h);
        //Q.3
        System.out.println("v*v-u*u");
        float u=S.nextFloat();
        float v=S.nextFloat();
        float i= v*v-u*u;
        System.out.println(i);

    }
}
