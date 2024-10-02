package strategy;

import CacheUtilities.CustomEntry;

import java.util.LinkedList;

public interface EvictionPolicy {
   public Integer getKeyToEvict(LinkedList<CustomEntry> ll);

}
