package LinkedHAshset;

import java.util.*;

public class All {
    public static void main(String[] args) {
        ArrayList<String> enames1=new ArrayList<String>();
        LinkedList<String> enames2=new LinkedList<String>();
        HashSet<String> enames3= new HashSet<String>();
        LinkedHashSet<String> enames=new LinkedHashSet<String>();
        enames.add("Balu");
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add(null);
        enames.add("Priya");
        enames.add("Modi");
        enames.add("Modi");
        System.out.println(enames);
//        System.out.println(enames4.size());
//        System.out.println(enames4.isEmpty());
//        System.out.println(enames4.contains("Modi"));
        //Itearte LinkedHashset
        for (String ename:enames) {
            System.out.println(ename);
        }
        Iterator itr=enames.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
