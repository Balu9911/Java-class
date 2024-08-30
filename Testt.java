
class Test2 {

    static int adhar = 34242;

    public static void main(String[] args) {
        System.out.println(adhar);
    }
}

class A {

    public static void main(String[] args) {
        int adhar = 67699;
        System.out.println("adhar");
        System.out.println(adhar);
    }
}

class f {

    public static void main(String[] args) {
        float adhar = 1234567891234567l;
        System.out.println(adhar);
    }
}

class U {

    public static void main(String[] args) {
        float rating = 22.98777777998f;
        long mobile = 9912460679l;
        double salary = 80000.98765433245566;
        System.out.println(rating);
        System.out.println(mobile);
        System.out.println(salary);
    }
}

class o {

    public static void main(String[] args) {
        char a = 'n';
        boolean dis = false;
        System.out.println("a");
        System.out.println("dis");
    }
}

class p {

    static byte b;
    static short s;
    static int i;
    static long l;

    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}

class q {

    static float f;
    static double d;
    static char c;
    static boolean b;

    public static void main(String[] args) {
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
    }
}

class r {

    public static void main(String[] args) {
        int[] sizes = {40, 42, 44};
        System.out.println(sizes);

        for (int size : sizes) {
            System.out.println(size);
        }
    }
}

class name {

    public static void main(String[] args) {
        String[] enames = {"balu", "subbu", "sai"};
        System.out.println(enames);
        for (String ename : enames) {
            System.out.println(ename);
        }
    }
}

class employee22 {

    public static void main(String[] args) {
        int a=10;
        String ename = "Rahul";
        employee e1 = new employee();
        employee e2 = new employee();
        System.out.println(e1);
        System.out.println(e2);

    }
}


class employee1{
    int eid=789;
    public void m1(){
        System.out.println("employee class -m1 method");
    }
   // public static void main(String[] args) {
       // System.out.println(eid);
    }


  class D{
    int a=100;
    int b=200;
    static int c=300;

    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        t2.b=20;
        System.out.println(t1.a+t1.b+t1.c);

    }
}  

