interface p1{
    public abstract void m1();

}
interface p2{
    public abstract void m2();

}
class child implements p1,p2{
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }

}


public class testfour {
    public static void main(String[] args) {
        
    
    child c1=new child();
    c1.m1();
    }
    
}
