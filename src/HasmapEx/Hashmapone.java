package HasmapEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Hashmapone {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList(Arrays.asList(101,102,103));
        HashMap<String,String> emp= new HashMap<String,String>();
        System.out.println(a1);
        System.out.println(emp);
        emp.put("eid","101");
        emp.put("ename","Balu");
        emp.put("esal","80000.90");
        emp.put("eloc","Bangalore");
        System.out.println(emp);
        System.out.println(emp.get("eid"));
        System.out.println(emp.get("ename"));
        System.out.println(emp.get("esal"));
        System.out.println(emp.get("eloc"));
    }
}
