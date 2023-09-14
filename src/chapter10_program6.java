import java.util.Scanner;

class Rectangle{
    int l;
    int b;
    Rectangle(int l,int b){
     this.l=l;
      this.b=b;
    }
    public int area() {
        return l*b;
    }
}
class cuboid extends Rectangle{
    int h;
    cuboid(int l,int b,int h){
        super(l, b);
        this.h=h;
    }
    public int area(){
        return 2*((l*b)+(l*h)+(b*h));
    }
    public int volume(){
        return l*b*h;
    }
}
public class chapter10_program6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
Rectangle R= new Rectangle(10,3);
cuboid c= new cuboid(12,3,3);
        System.out.println(R.area());
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
