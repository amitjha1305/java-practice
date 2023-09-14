public class chapter7_proram5 {
    static int  fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n ==  2) {
            return 1;
        } else {

                n = fibonacci(n - 1) +fibonacci (n - 2);
                return n;
            }
        }

    public static void main(String[] args){
        System.out.println("Q.print fibonacci series");
     //   fibonacci(5);
        System.out.println(fibonacci(6));

    }
}
