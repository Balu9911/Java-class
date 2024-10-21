class arrayeexcp {
    // public static void main(String[] args) {
    //     String[] enames={"balu","rahul","sonia"};
    //     System.out.println(enames[0]);
    //     System.out.println(enames[4]);
    //     System.out.println(enames[2]);
    // }

    public static void main(String[] args) {
         String[] enames={"balu","rahul","sonia"};
         System.out.println(enames[0]);
         try {
            System.err.println(enames[10]);
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
         }
         System.out.println(enames[2]);


        
    }
    
}
