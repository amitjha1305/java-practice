abstract class a{
    public a(){
        System.out.println("Abstrat method ");
    }
    public void hello(){
        System.out.println("hello");
    }
    abstract public void great();
    abstract public void great2();
}
class b extends a{
    @Override
    public void great(){
        System.out.println("good morning ");
    }
    @Override
    public void great2(){
        System.out.println("good evening  ");
    }
}
abstract class c extends a{
    public void the(){
        System.out.println("i am good");
    }
}
public class Chapter11_program1 {
    public static void main(String[] args) {
     // a A= new a(); // abstrat class
      b B= new b();
     // c C = new c();  // abstract alss




    }
}
