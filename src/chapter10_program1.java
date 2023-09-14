class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void name(){
        System.out.println("my name is amit ");
    }
}
class group extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class animal{
String x;
    public String getX() {
        x="i have 4 leg /n i have 2 ear and eyes ";
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
}
class derive extends animal{
    String y;

    public String getY() {
        y="i am a dog ";
        return y;
    }
}
public class chapter10_program1 {
    public static void main(String[] args) {
        base b=new base();
        b.setX(34);
        System.out.println(b.getX());
        group g= new group();
        g.setY(34);
        g.setX(4);
        System.out.println(g.getX()+ g.getY());
        animal a = new animal();
        derive d= new derive();
  //      System.out.println(a.getX());
        System.out.println(d.getX());
        System.out.println(d.getY());
    }

}
