
class employee2 {

    static int eid = 10;

    public static void m1() {
        System.out.println("employee class -m1 method");
    }

    public static void main(String[] args) {
        //System.out.println(eid);
        m1();
    }
}

class employee {

    int eid = 67;

    public void m1() {
        System.out.println("employee class -m1 method");
        //non-static member
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        System.out.println(e1.eid);
        e1.m1();

    }
}

class employe {

    int a = 100; //instance varibale we can't execute.non-static method error will come in compilation
    static int b = 200; // static variable we can execute

    public static void main(String[] args) {
        c = 300; //local variable we can execute.it is within a block

    }
}

class Test {

    int a = 100;
    int b = 200;
    static int c= 300;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t2.b=20;
        System.out.println(t1.a+t1.b+t1.c);

    }
}
