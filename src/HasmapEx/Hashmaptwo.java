package HasmapEx;

import java.util.HashMap;
import java.util.Set;

public class Hashmaptwo {
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String,String>();
        System.out.println(product);
        product.put("pid","01");
        product.put("pname","Mobile");
        product.put("price","45000.99");
        product.put("discount","false");
        System.out.println(product);
        //print all key:values pairs - using keyset();
        //print all values using - values();
        //print all key:values - using entryset();
        Set<String> keys=product.keySet();
        System.out.println(keys);
        for (String key:keys){
            System.out.println(key+":"+product.get(key));
        }
    }
}
