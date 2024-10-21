class arthamaticexcp {
    // public static void main(String[] args) {
    //     System.out.println(10/2);
    //     System.out.println(10/0);
    //     System.out.println(10/5);
    // }
    public static void main(String[] args) {
        System.out.println(10/2);
        try {
            System.err.println(10/0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            //System.out.println(10/1);
        }
        System.out.println(10/5);
    }
    
}
