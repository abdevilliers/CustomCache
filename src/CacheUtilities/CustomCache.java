package CacheUtilities;

import strategy.EvictionPolicy;

import java.util.LinkedList;

public class CustomCache {
    LinkedList<CustomEntry> list;
    EvictionPolicy evictionPolicy;
    int capacity;

    public EvictionPolicy getEvictionPolicy() {
        return evictionPolicy;
    }

    public void setEvictionPolicy(EvictionPolicy evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
    }

    public CustomCache(Integer capacity){
        list = new LinkedList<>();
        this.capacity = capacity;
    }
    public Integer get(Integer key){
        CustomEntry ce = new CustomEntry(key,-1);
        Integer returnValue = -1;
       System.out.println(toString());
        System.out.println("swtf");
        for(int i=0;i<list.size();i++){
            if(this.list.get(i).getKey().equals(key)){
                this.list.get(i).setFreq(this.list.get(i).getFreq()+1);
                return this.list.get(i).getValue();
            }
        }
        return Integer.MAX_VALUE;
        /**
        System.out.println(this.list);
        if(list.contains(ce)){
            Integer freq = list.indexOf(ce);
            Integer oldFreq = list.get(freq).getFreq();
            ce.setFreq(oldFreq+1);
            returnValue = list.get(freq).getValue();
            list.remove(list.indexOf(ce));
        }
        else{
            return Integer.MAX_VALUE;
        }
        ce.setValue(returnValue);
        list.addFirst(ce);
        return returnValue;
         */

    }
    public boolean addNewPair(Integer key,Integer value){
        int curSize = list.size();
        CustomEntry customEntry = new CustomEntry(key,value);
        if(curSize == capacity){
            Integer deleteKey = evictionPolicy.getKeyToEvict(list);
          //  Integer deleteKey = 1;
           CustomEntry deleteObj = new CustomEntry(deleteKey,-1);
           list.remove((int)deleteKey);
        }
        if(list.contains(customEntry)){
            Integer freq = list.indexOf(customEntry);
            Integer oldFreq = list.get(freq).getFreq();
            customEntry.setFreq(1);
            list.remove(list.indexOf(customEntry));
        }
        else{
            customEntry.setFreq(1);
        }

        list.addFirst(customEntry);
        System.out.println(this.toString());
        return true;
    }
    public String toString(){
        return this.list.toString();
    }
}
