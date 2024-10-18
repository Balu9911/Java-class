class arr {
    public static void main(String[] args) {
        int[] eids={101,102,103,104};
        System.out.println(eids[0]);
        System.out.println(eids[1]);
        try {
        System.out.println(eids[10]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println(eids[3]);
    
    }
    
}
