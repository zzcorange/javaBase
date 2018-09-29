package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author chengzi
 * @Date 2018/9/27 20:35
 */
public class ThreadTest {
    public static AtomicInteger number = new AtomicInteger(0);
   public static void main(String...args){
       new ThreadDemo(0).start();
       new ThreadDemo(1).start();
       new ThreadDemo(2).start();
   }

}
class ThreadDemo extends  Thread{
    private int i;
    public ThreadDemo(int i){
        this.i = i;
    }
    @Override
    public void run(){
        while (ThreadTest.number.get()<75){

            if((ThreadTest.number.get()/5)%3==i)
            System.out.println(i+"->"+ThreadTest.number.addAndGet(1));
        }
    }
}
