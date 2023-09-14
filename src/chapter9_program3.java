import java.util.Scanner;
/*
class cylinder{
    float height;
    float radius;
// constructor method  problem 3
    public cylinder() {
        Scanner sc = new Scanner(System.in);
        this.height =sc.nextFloat() ;
        this.radius = sc.nextFloat();
    }
//setter /getter problem 1 and 2
    public void setHeight(float a){
        height=a;
    }
    public float getHeight(){
        return height;
    }
    public void setRadius(float r){
        radius=r;
    }
    public float getRadius() {
        return radius;
    }
    public float surface_area(){
        return 2*radius*3.1414f*(radius+height);
    }
    public float volume() {
        return 2 * radius * 3.1414f * height;
    }
}

 */
//problem 4
class rectangular{
    private int l;
    private int b;


    public rectangular() {
        this.l = 43;
        this.b = 5;
    }
    public rectangular(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }
    public int getB() {
        return b;
    }
}
public class chapter9_program3 {
    public static void main(String[] args) {
      /*  cylinder c = new cylinder();
        Scanner sc = new Scanner(System.in);
        //problem 1 ,2 and 3
//        float x= sc.nextFloat();
//        float y= sc.nextFloat();
//        c.setHeight(x);
//        c.setRadius(y);
        System.out.println("height "+c.getHeight());
        System.out.println("radius "+c.getRadius());
        System.out.println("surface area "+c.surface_area());
        System.out.println("volume  "+c.volume());
       */
        //problem 4
        rectangular r= new rectangular(34,43);
        System.out.println(r.getB());
        System.out.println(r.getL());
    }
}
