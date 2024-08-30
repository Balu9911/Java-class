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

