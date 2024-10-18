class testab{
    //autoboxing:-converting primitive to object
    public static void main(String[] args) {
        //Integer i=10; //auttoboxing adv of autoboxing conerting 
        Integer i=Integer.valueOf(10);
        System.out.println(i);
        System.out.println(i.byteValue());
        System.out.println(i.doubleValue());
        System.out.println(i.floatValue());
        System.out.println(i.shortValue());
        System.out.println(i.intValue());
    }
}