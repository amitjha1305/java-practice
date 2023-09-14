class PHONE{
    public void on(){
        System.out.println("welcome in phone");
    }
    public void call(){
        System.out.println("call list");
    }
}
class SMARTPHONE extends PHONE{
    public void on(){
        System.out.println("welcome in Smartphone");
    }
    public void game(){
        System.out.println("Free fire ");
    }
}
public class Chapter10_program4 {
    public static void main(String[] args) {
PHONE use = new SMARTPHONE();
use.call();
use.on();
//use.game(); //? not allowed
    }
}
