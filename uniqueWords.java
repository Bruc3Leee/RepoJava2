package homeWorkJava3;

import java.util.*;

public class uniqueWords {
    public static void main(String[] args) {
        String[] words = {"robot", "Human", "Dog", "fish", "cloak", "fish", "cat", "robot", "call", "phone"};

        Map <String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(" ");

        Set <String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);
        System.out.println(" ");

        phoneDirectory pb = new phoneDirectory();

        pb.add("Сидоров", "123");
        pb.add("Смирнов", "456");
        pb.add("Сидоров", "789");

        System.out.println(pb.get("Сидоров"));
    }
}
