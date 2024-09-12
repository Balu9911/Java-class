class Test2{
    public static void main(String[] marks) {
        int a=10;
        ++a;
        System.out.println(++a);
    }
}

class Test3{
    public static void main(String[] args) {
        int a=10;
        a++;
        System.out.println(a++);
    }
}

class Test4{
    public static void main(String[] args) {
        int a=10;
        //int b=a++;
        int b=++a;
        System.out.println(a);
        System.out.println(b);
    }
}