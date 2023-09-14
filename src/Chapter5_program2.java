import java.util.Scanner;

public class Chapter5_program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       /*// 1st problem
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/
      //2nd problem
        int sum =0;
        for (int i=0;i<n;i++){
             sum = sum +2*i;
        }
        System.out.println(sum);
    /* //  3nd and 4th problem
       int i = 1;
       while(i<=10){
           int a = n*i;
           System.out.println(n+"*"+i+"="+a+"");
           i++;
       }
        System.out.println("5th problem");
        int n = 5;
      int i= 1;
      int a=1;
      while(i<=n){
        a=a*i;
          System.out.println(a);
          i++;
      }
        System.out.println("6th problem");
        int i=1;
        while(i<=n){
            System.out.println(n);
            i++;
        }
        System.out.println("8th problem");
        int a= 0;
        for (int i = 1; i<=10;i++){
           a= a+(n*i);
            System.out.println(a);
        }*/
    }
}
