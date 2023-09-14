class employee{
    String  name;
  int   salary;
    public int  getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
      name = n;
    }

}
class phone{
    public void ring(){
        System.out.println("ringing..");
    }
    public void vibrate (){
        System.out.println("vibrateing ..");
    }
    public void call(){
        System.out.println("gautam..");
    }

}
class square{
    int n ;
    public int perimter(){
        return 4*n;
    }
    public int area(){
        return n*n;
    }
}
class rectangle{
    int a;
    int b;
    public int perimter(int a,int b){
      int   n=a+b;
        return 2*n;
    }
    public int area(int a,int b){
        return a*b;
    }
}
class tommy{
   public void hit(){
       System.out.println("hitting the enenmy");
   }
    public void run(){
        System.out.println("runing the enenmy");
    }
    public void kill(){
        System.out.println("killing the enenmy");
    }
    public void fir(){
        System.out.println("firring the enenmy");
        }
}
class circle{
    int r;
    public double circumference(){
        double c= 3.14;
       return 2*c*r;
    }
    public double area(){
        double c= 3.14;
        return r*c*r;
    }
}
public class chapter8_program2 {
    public static void main(String[] args) {
//problem 1
   /*     employee amit = new employee();
        amit.setName ("amit kumar jha");
        System.out.println(amit.getName());
        amit.salary=4323;
        System.out.println(amit.getSalary());
//problem 2
phone techno =new phone();
techno.call();
techno.ring();
techno.vibrate();
// Problem 3
        square side= new square();
        side.n=2;
        System.out.println(side.perimter());
        System.out.println(side.area());
//problem 4
        rectangle l= new rectangle();
//       rectangle w= new rectangle();
//       l.a=3;
//       w.b=1;
        System.out.println(l.perimter(3,1));
        System.out.println(l.area(3,1));


//problem 5
    tommy game= new tommy();
    game.fir();
    game.hit();
    game.kill();
    game.run();
    */
        //problem 6
    circle side =new circle();
    side.r=7;
        System.out.println(side.circumference());
        System.out.println(side.area());
    }
    }
