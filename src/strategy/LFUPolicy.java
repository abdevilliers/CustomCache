package strategy;

import CacheUtilities.CustomEntry;

import java.util.LinkedList;

public class LFUPolicy implements EvictionPolicy{
    @Override
    public Integer getKeyToEvict(LinkedList<CustomEntry> ll) {
        int optFreq = Integer.MIN_VALUE;
        int keyToDel = -1;
        for(int i=0;i<ll.size();i++){
            int curFreq = ll.get(i).getFreq();
            if(curFreq>optFreq){
                optFreq = curFreq;
                keyToDel = i;

            }
        }
        System.out.println("pair "+ll.get(keyToDel).toString()+" is to be deleted!!");
        return keyToDel;
    }
}
