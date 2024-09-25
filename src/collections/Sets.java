package collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Carla");
        conjunto.add("Victoria");
        conjunto.forEach(System.out::println);
    }
}
