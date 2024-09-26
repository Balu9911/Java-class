class employee{
    String name;
    employee(string name){
        this.name=name;
    }
}
class manager extends employee{
    string dept;

     manager(string dept, string name) {
        super(name);
        this.dept = dept;
    }
    
}
public class Testfive {
    public static void main(String[] args) {
       manager m=new manager("cse", "balu");
       System.out.println(m.dept);
       System.out.println(m.name);
    }
    
}
