package practice_25_26;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        hashMap.add("k1", 1);
        hashMap.add("k9", 9);
        hashMap.add("k5", 5);
        hashMap.add("k3", 3);
        hashMap.add("k4", 4);
        hashMap.add("k2", 2);
        System.out.println("Get key 'k1': value=" + hashMap.get("k1"));
        System.out.println("Get key 'k5': value=" + hashMap.get("k5"));
        System.out.println("Remove key 'k3': value=" + hashMap.remove("k3"));;
        for (Integer V : hashMap) {
            System.out.println(V);
        }
    }
}
