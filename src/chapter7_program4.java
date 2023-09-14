public class chapter7_program4 {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    static int factorial2(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=n;i++){
                product *=i;
            }return product;
        }
    }
    public static void main(String[] args ){
        System.out.println("chapter7.4");
        int n=3;
        System.out.println(factorial(n));
        System.out.println(factorial2(n));
    }
}
