class jaiEmployee{
     private int id;
     private String name;
     public  jaiEmployee(){
    id =24324;
    name ="amit kumar jha";
    }
    public void setId(int i) {this.id = i;}
    public int getId(){return id;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
}
public class chapter9_program2 {
    public static void main(String[] args) {
        jaiEmployee amit=new jaiEmployee();
        System.out.println(amit.getId());
        System.out.println(amit.getName());

    }
}
