//Overriding method
class A {
    public int a;
    public int amit(){
return 4;
    }
    public void s1(){
        System.out.println("i am A1");
    }
}
class B extends A{
    @Override
    public void s1(){
        System.out.println("i am B1");
    }
    public void B1(){
        System.out.println("i am B2");
    }
}
public class Chapter10_program3 {
    public static void main(String[] args) {
A a = new A();
a.s1();
B b= new B();
b.s1();
    }
}
