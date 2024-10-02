package CacheUtilities;

public class CustomEntry {
    private Integer key,value,freq;
    public CustomEntry(Integer key,Integer value){
        this.key = key;
        this.value = value;
        this.freq = 0;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    @Override
    public boolean equals(Object obj) {
        CustomEntry ce = (CustomEntry)obj;
        if(ce.getKey() == this.getKey()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getKey();
    }
    @Override
    public String toString(){
        return "["+this.key+", "+this.value+", "+this.freq+"], ";
    }
}
