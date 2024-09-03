class Z{
    int a=100;
    int b=200;
    static int c=300;

    public static void main(String[] args) {
        Z t1=new Z();
        Z t2=new Z();
        t2.b=20;
        System.out.println(t1.a+t1.b+t1.c);
        System.out.println(t2.a+t2.b+t2.c);        
    }
}

class Account{
    int acc_id;
    String acc_name;
    double acc_bal;
    static double min_bal;
    static String branch_name="SBI";

    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account();
        Account a3=new Account();
        a1.acc_id=101;
        a1.acc_name="balu";
        

        System.out.println(a1.acc_id);
        System.out.println(a1.acc_name);


    }
}

class G{
    int a=100;
    static int b=290;
    
    public static void main(String[] args) {
        int c=300;

        G g1=new G();
        //instance variable
        System.out.println(g1.a);//100
        //static varibale example
        System.out.println(G.b);//using class name
        System.out.println(g1.b);//using object name
        System.out.println(b);//using directly
        System.out.println(c);
        System.out.println(g1.a);
    }
} 
 class H{
    public static void main(String[] args) {
        int a=100;
    }
    
 }

 

