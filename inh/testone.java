class Parent{
    public void m1(){
        System.out.println("Bala");
    }
    public void m2(){
        System.out.println("subra");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("manyam");
    }
}
class TestOne{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}