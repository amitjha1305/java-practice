import java.util.Random;
import java.util.Scanner;

class game {
    int comp;
    int me;
public game(){

    Random rand = new Random();
    comp = rand.nextInt(0,100);
}
void me(){
    Scanner sc = new Scanner(System.in);
    me = sc.nextInt();
}
    public int guessed() {
        if (comp > me) {
            System.out.println("u are going close to number");
        } else if (me > comp) {
            System.out.println("u are going far to number");
        } else {
            System.out.println("congratulation u guess the number");
        }   return me;
    }
}
    public class guess_the_no {
        public static void main(String[] args) {
            game round1 = new game();
            for(int i=0;i<10;i++){
                round1.me();
                round1.guessed();
            }
    }}

