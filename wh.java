class r{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){       //for loop example
            System.out.println(i);
        }
    }
}

class f{
    public static void main(String[] args) {    //while loop example
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;

        }
    }
}

class dw{
    public static void main(String[] args) {
        int i=1;                       //do-while loop example
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}

class d{
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107};
        for(int eid:eids){
            System.out.println(eid);
        }
    }
}

class e{
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107};
        for(int i=0;i<=6;i++){
            System.out.println(eids[i]);
        }
    }
}

class u{
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107};
        int i=0;
        while(i<=6){
            System.out.println(eids[i]);
            i++;
        }
    }
}

class o{
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107};
        int i=0;
        do{
            System.out.println(eids[i]);
            i++;
        }
        while(i<=6);
    }
}
