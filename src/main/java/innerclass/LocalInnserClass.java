package innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chengzi
 * @Date 2018/9/18 21:36
 */
interface Counter{
    int next();
}
public class LocalInnserClass {
    private int count = 0;
    Counter getCounter(final String name){
        class LocalCounter implements  Counter {
            public LocalCounter(){
                System.out.println("LocalCounter()");
            }
            public int next(){
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    public static void main(String...args){
        int i=0;
        System.out.println(i++);
        i = 0;
        System.out.println(++i);
        List<Object> list = new ArrayList<Object>();
        list.add("111");
    }
}
