package prac3;

public class MapOnLockCore<K, V> {
    private K key;
    private V value;

    public MapOnLockCore(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String MapReturn() {
        String returnState = this.key.toString() + " " + this.value.toString();
        return returnState;
    }
}