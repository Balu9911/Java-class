class nullpointerexce {
    // public static void main(String[] args) {
    //     String ename=null;
    //     System.out.println(ename.length());
    // }
    public static void main(String[] args) {
         String ename=null;
         try {
        System.out.println(ename.length());  
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
         }
         

        
    }
    
}
