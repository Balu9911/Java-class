abstract class A{
    abstract void m1();

}
class Test extends A{
    void m1(){ }
    public static void main(String[] args) {
        B b1=new B();
        b1.m1();
        
    }
    
}