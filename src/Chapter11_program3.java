interface cycle{
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface horns{
    void horn1();
    void horn2();
}
class AvonCycle implements cycle,horns{
    void sound(){
        System.out.println("piiiiiiiiii");
    }
   public void applyBrake(int decrement){
       System.out.println("applyBrake");
   }
    public void speedup(int increment){
        System.out.println("speedup");
    }
   public void horn1(){
       System.out.println("jai hoo");
   }
   public void horn2(){
       System.out.println("jai jai");
   }

}
public class Chapter11_program3 {
    public static void main(String[] args) {
        AvonCycle amit= new AvonCycle();
        amit.applyBrake(1);
        amit.horn1();
        amit.horn2();
        amit.speedup(1);
        amit.sound();
        }
    }

