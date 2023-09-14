public class chapter7_program_2 {
    static void telljoke(){
        System.out.println("i am the boss ");
    }
    static void change(int a){
        a =54;
    }
    static void change2(int [] arr){
        arr [0]=43;
    }
    public static void main(String[]args){
        telljoke();
        int x =45;
        change(x);
        System.out.println(x);
        int [] marks= {23,43,54,65,65};
        change2(marks);
        System.out.println(marks[0]);
    }
}
