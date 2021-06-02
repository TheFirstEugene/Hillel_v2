public interface Map<K, V> {

    void put(K k, V v);
    boolean isEmpty();
    V get(K k);
    boolean remove(K k);
}
