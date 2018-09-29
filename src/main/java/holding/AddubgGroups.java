package holding;

import java.util.*;

/**
 * @Author chengzi
 * @Date 2018/9/25 19:51
 */
public class AddubgGroups {
    public static void main(String[] args){
        Collection<Integer> collection  = new ArrayList<Integer>();
        Collections.addAll(collection,1,2,3,4,5,6);
        for(int i:collection)
            System.out.println(i);
        Collection<String> collectionString = new ArrayList<String>(Arrays.asList("a","b"));
        for(String s:collectionString)
            System.out.print(s);
        System.out.println("");
        collectionString.add("c");
        Collection<String> list = Arrays.asList("a","b");
        list.add("c");
        for(String s:list)
            System.out.print(s);
    }


}
