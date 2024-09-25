class gp{
    public void m1(){
        System.out.println("bala");
    }
}
class parent extends gp{
    public void m2(){
        System.out.println("subbu");

    }
}
class Child extends parent{
    public void m3(){
        System.out.println("balu");

    }
}



public class testtwo {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
    
}
