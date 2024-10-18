class err {
    public static void main(String[] args) {
        System.out.println("mrng");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
           // System.out.println("can't divisble by zero");
           System.out.println(10/2);
        }
        System.out.println("aftrn");
    }
    
}
