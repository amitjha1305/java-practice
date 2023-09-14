class bases{
public bases(){
       System.out.println("constructor ");
   }

   bases(int a){
       System.out.println("i am bases1 = "+a);
   }
}
class bases2 extends bases{
    bases2(){
        System.out.println("i am base2 default program");
    }
    bases2(int a,int b){
super(a);
        System.out.println("i am bases2 = "+ b);
    }
}
class bases3 extends bases2{
    bases3(){
        System.out.println("i am base3 default program ");
    }
    bases3(int a,int b,int c){
     super(a,b);
        System.out.println("i am bases3 = "+c);
    }
}
public class Chapter10_program2 {
    public static void main(String[] args) {
        //bases b = new bases(2);
      //  bases2 b2 = new bases2(23,34);
        bases3 b3 = new bases3(12,34,45);

    }
}