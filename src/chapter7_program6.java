public class chapter7_program6 {
 //Question 1.
  /* static  void table(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d \n",n,i,n*i);
        }
    }*/
//    Question 2.
 /*   static void star(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }

    }*/
//    Question 3.
  /*  static int  sum(int n) {
        if(n==1){
            return 1;
        }
        return n +sum(n-1);
    }*/
    //Question 4.
   /* static void star2(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println( );
        }
    }*/
    //Question 8.
   /* static void repeatQ2(int n){
        if(n>0){
            repeatQ2(n-1);
            for(int j =0;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }*/
    //Question 7.
 static void repeatQ4(int n){
     if(n>0){
       //
         for(int j =n;j>0;j--){
             System.out.print("*");
             repeatQ4(n-1);
         }
         System.out.println(" ");
     }
 }
    public static void main(String[] args){
/*Question 1.
        int n=4;
        table(n);
//   Question 2.
        star(4);
        //Question 3.
        System.out.println(sum(3));
        //Question 4.
        star2(4);
        //Question 7.
        repeatQ4(3);
        //Question 8.
      //  repeatQ2(3);*/

    }
}
