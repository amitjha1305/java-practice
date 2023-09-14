class circle1{
    public int r;
    circle1(int a){

      this.r=a;
    }
   public double a= Math.PI;
   double b= 4.0/3.0;
    public double area(){
        System.out.println("Circle");
       return a*r*r;
    }
    public double volume(){
        return b*a*r*r*r;
    }
    }
    class cylinder extends circle1{
    public double h;

    cylinder(int a,int b){
        super(a);
        System.out.println("Cylinder");
        this.h= b;
    }
        public double area(){
        return a*r*(r+h);
        }
        public double volume() {
        return a*r*r*h;
        }
    }
public class Chapter10_program5 {
    public static void main(String[] args) {
circle1 c1= new circle1(2);
        System.out.println(c1.area());
        System.out.println(c1.volume());
cylinder cy=new cylinder(2,2);
        System.out.println(cy.volume());
        System.out.println(cy.area());
    }
}

