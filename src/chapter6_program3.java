import java.util.Scanner;

public class chapter6_program3 {
    public static void main(String[] args) {
        System.out.println("2D array");
      //  int [] marks;// 1D array
        int [][]flats;//2D arry
        flats = new int [2][3];
        Scanner sc = new Scanner(System.in);
         flats [0][0] = sc.nextInt();
        flats [0][1] = sc.nextInt();
        flats [0][2] = sc.nextInt();
        flats [1][0] = sc.nextInt();
        flats [1][1] = sc.nextInt();
        flats [1][2] = sc.nextInt();
     for (int i=0;i<flats.length;i++) {
         for(int j=0; j<flats[i].length;j++) {
             System.out.print(flats[i][j]);
             System.out.print("  ");
         }
         System.out.println("");
     }
    }
}
