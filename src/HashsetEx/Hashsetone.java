package HashsetEx;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetone {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();
        HashSet<String> hs2=new HashSet<String>();
        HashSet<String> hs3=new HashSet<String>(100);
        HashSet<String> hs4=new HashSet<String>(150,0.90f);
        hs1.add(101);
        hs1.add(101);
        hs1.add("Balu");
        hs1.add("Balu");
        hs1.add("Bangalore");
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(hs3);
        System.out.println(hs4);
        //Using for each
//        for (Object obj:hs1){
//            System.out.println(obj);
//        }
        //Using Iterator
        Iterator itr=hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//        for(int i=0;i< hs1.size()-1;i++){
//            System.out.println();
//        }


    }
}
