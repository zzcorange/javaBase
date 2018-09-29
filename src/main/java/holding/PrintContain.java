package holding;

import java.util.*;

/**
 * @Author chengzi
 * @Date 2018/9/25 20:07
 */
public class PrintContain {
    public static Collection fill(Collection<String> collection) {
        collection.add("Dog");
        collection.add("Dog");
        collection.add("cat");
        collection.add("cat");
        return collection;
    }

    public static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void print(Collection<String> collection) {
        for (String s : collection)
            System.out.print(s);
        System.out.println("");
    }

    public static void print(Map<String, String> map) {
        for (String s : map.keySet())
            System.out.print(map.get(s));
        System.out.println("");
    }

    public static void main(String... args) {
//        print(fill(new ArrayList<String>()));
//        print(fill(new LinkedList<String>()));
//        print(fill(new HashSet<String>()));
//        print(fill(new TreeSet<String>()));
//        print(fill(new LinkedHashSet<String>()));
//        print(fill(new HashMap<String,String>()));
//        print(fill(new TreeMap<String,String>()));
//        print(fill(new LinkedHashMap<String,String>()));
        Random rand = new Random(47);
        Integer[] ia = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ia));
        Collection<Integer> collection = list;
        System.out.println(collection);

    }
}
