// abstract class A{
//     abstract void m1();

// }
// class Test extends A{
//     void m1(){ }
//     public static void main(String[] args) {
//         B b1=new B();
//         b1.m1();
        
//     }   
// }


abstract class Account{
    public void open_Ac(){
        System.out.println("Acc opened");
    }
    public abstract int get_bal();
    
}
class SA extends Account{
    public int get_bal(){
        return 100;
    }
    public static void main(String[] args) {
        SA a1=new SA();
        a1.open_Ac();
        int bal=a1.get_bal();
        System.out.println(bal);

    }
}