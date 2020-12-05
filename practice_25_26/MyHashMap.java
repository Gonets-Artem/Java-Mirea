package practice_25_26;

import java.util.ArrayList;
import java.util.Iterator;

public class MyHashMap<K, V> implements HashMapInterface<K, V> {
    private final ArrayList<ArrayList<Item<K, V>>> hashTable;
    private final int MyHashMapSize = (int)Math.pow(2, 2);

    public MyHashMap() {
        hashTable = new ArrayList<>();
        for (int i = 0; i < MyHashMapSize; i++) {
            hashTable.add(new ArrayList<>());
        }
    }

    @Override
    public void add(K key, V value) {
        int index = key.hashCode() % hashTable.size();
        if (hashTable.get(index).size() == 0) {
            hashTable.get(index).add(new Item<>(key, value));
        }
        else {
            boolean flag = false;
            for (int i = 0; i < hashTable.get(index).size(); i++) {
                if (hashTable.get(index).get(i).getKey().equals(key)) {
                    hashTable.get(index).set(i, new Item<>(key, value));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                hashTable.get(index).add(new Item<>(key, value));
            }
        }
    }

    @Override
    public V get(K key) {
        int index = key.hashCode() % hashTable.size();
        for (int i = 0; i < hashTable.get(index).size(); i++) {
            if (hashTable.get(index).get(i).getKey().equals(key)) {
                return hashTable.get(index).get(i).getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = key.hashCode() % hashTable.size();
        for (int i = 0; i < hashTable.get(index).size(); i++) {
            if (hashTable.get(index).get(i).getKey().equals(key)) {
                Item<K, V> item = new Item<>();
                item.setValue(hashTable.get(index).get(i).getValue());
                hashTable.get(index).remove(hashTable.get(index).get(i));
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public Iterator<V> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<V> {
        private int currentIndexOfArray = 0, currentIndexOfItem = 0;

        @Override
        public boolean hasNext() {
            if (currentIndexOfItem == hashTable.get(currentIndexOfArray).size()) {
                currentIndexOfItem = 0;
                do {
                    currentIndexOfArray++;
                } while (currentIndexOfArray < MyHashMapSize && hashTable.get(currentIndexOfArray).size() == 0);
            }
            return currentIndexOfArray < MyHashMapSize;
        }

        @Override
        public V next() {
            return hashTable.get(currentIndexOfArray).get(currentIndexOfItem++).getValue();
        }
    }
}
