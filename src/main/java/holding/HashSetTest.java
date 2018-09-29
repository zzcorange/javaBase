package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author chengzi
 * @Date 2018/9/27 21:31
 */
public class HashSetTest {
    public static void main(String...args){
        Set<Integer> set = new HashSet<Integer>();
        Integer iobject;
        Random random = new Random();
        for(int i = 0;i<1000;i++){
            iobject= random.nextInt(1000);
            System.out.print(iobject+",");
            set.add(iobject);
        }
        System.out.println();
        System.out.println(set);
    }
}
