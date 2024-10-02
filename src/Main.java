import CacheUtilities.CustomCache;
import CacheUtilities.CustomEntry;
import strategy.LFUPolicy;
import strategy.LRUPolicy;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
        CustomCache cc = new CustomCache(5);
        cc.setEvictionPolicy(new LRUPolicy());
        System.out.println("wtgs");
      cc.addNewPair(1,2);
      cc.addNewPair(1,5);
      cc.addNewPair(2,5);
      cc.addNewPair(5,53);
      cc.addNewPair(5,6);
      cc.addNewPair(325,636);
      cc.addNewPair(535,3636);
      cc.addNewPair(346363,363637);
      cc.addNewPair(-1,-3);
      System.out.println(cc.get(-1));
      System.out.println(cc.get(535));
      System.out.println(cc.get(3253535));
        System.out.println(cc.get(325));
        System.out.println(cc.get(325));
        System.out.println(cc.get(325));
        System.out.println(cc.get(325));
        System.out.println(cc.get(325));
        System.out.println(cc.get(535));
        cc.setEvictionPolicy(new LFUPolicy());
        cc.addNewPair(5555555,5555555);
        cc.addNewPair(11111,11111);
      CustomEntry ce1 = new CustomEntry(5,5);
      CustomEntry ce2 = new CustomEntry(4,6);
      System.out.println(ce1.equals(ce2));
      System.out.println(ce1==ce2);
         */
        HashMap<String,Integer> hm = new HashMap();

        String obj1 = "5";
        String obj2 = "5";
        String obj3 = "6";
        System.out.println(obj1 == obj2);
        System.out.println(obj3==obj1);
        Integer val1 = Integer.valueOf(4);
        Integer val2 = Integer.valueOf(4);
        Integer val3 = 4;

        System.out.println(val1 == val2);
        System.out.println(val3 == val1);
        System.out.println(val1 == val3);

        }
    }
