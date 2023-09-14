import java.util.Scanner;

public class chapter_7program_1 {
  static int logic(int x,int y){
      int z;
      if(x>y){
          z=x+y;
      }
      else{
          z=y-x;
      }
      return z;
  }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= logic(a,b);
        System.out.println(c);
    }
}
