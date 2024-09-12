class R{
    public static void main(String[] args) {
        int []a ;
        a=new int [4];
        a[0]=100;
        a[1]=200;
        a[3]=300;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[3]);
        System.out.println(a);
    }
 }

 class T{
    public static void main(String[] args) {
        int[] a;
        a=new int[4];
        String[] enames;
        enames=new String[4];

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[3]);
        System.out.println(enames[1]);
    }
 }

 class Q{
    public static void main(String[] args) {
        int[] eids={101,102,103};
        String[] enames={"balu","harish","ravi"};

        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[2]);
        System.out.println(enames[0]);
    }
 }

 //class X{
 //   public static void main(String[] args) {
 //       int[] eids={101,102,103,104};
 //       String[] enames={"balu","harush","jaga"};

 //       for (String name:enames);
  //      System.out.println(ename);
        
  //  }
 //}

 class L{
    int a=100;
    public static void main(String[] args) {
       // System.out.println(a);
    }
    
 }

 class p{
    public static void main(String[] args) {
        String ename="balasubramanyam";
        String[] enames={"rahul","sonia","priya"};
        System.out.println(ename.length());
        System.out.println(enames.length);

    }
 }

 class k{
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
       // int[][] two-D={{1,2,3},{4,5,6},{7,8,9}};
       int[][] two_D={{1,2,3},{4,5,6},{7,8,9}};
       int sum=0;
       for (int[] number:two_D){
        for (int num:number){
            sum=sum+num;
        }
        System.out.println(sum);
       }
    }
 }

 class v{
   public static void main(String[] args) {
       System.out.println(args[0]);
       System.out.println(args[1]);
                                             //ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0. THIS ERROR WILL COME
       System.out.println(args[2]);    
   }
 }

 class y{
   public static void main(String[] marks) {
     // System.out.println(marks[0]+marks[1]);
      System.out.println(Integer.parseInt(marks[0])+Integer.parseInt(marks[1]));
       
   }
 }

 class q{
   public static void main(String[] args) {
       m1();
   }
   public static int m1(){
      return 0;
      System.out.println('m1');
   }
 }