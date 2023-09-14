class myemployee{
   private String user;
    private int id;
    public void setUser(String n){
       this.user=n;
    } public String getUser(){
       return user;
    } public void setId(int i){
       this.id=i;
    } public int getId(){
        return id;
    }
}
public class chapter9_program1 {
    public static void main(String[] args) {
        myemployee amit =new myemployee();
       // amit.Id =423;
     //   amit.User="amit kumar jha";
        amit.setUser("amit kumar jha");
        amit.setId(2342);
        System.out.println(amit.getUser()  );
        System.out.println(amit.getId());

    }
}
