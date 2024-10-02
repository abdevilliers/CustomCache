package strategy;

import CacheUtilities.CustomEntry;

import java.util.Iterator;
import java.util.LinkedList;


public class LRUPolicy implements EvictionPolicy{


    @Override
    public Integer getKeyToEvict(LinkedList<CustomEntry> list) {
        if(list.isEmpty()){
            return null;
        }
        System.out.println("pair "+list.get(list.size()-1).toString()+" is to be deleted!!");
        return list.size()-1;


    }
}
