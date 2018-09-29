package innerclass;

/**
 * @Author chengzi
 * @Date 2018/9/16 16:53
 */
public class InnerClass {
     private int a= 1;
    class innerInInner{
        public void value(){
            System.out.println(a);
        }
    }
}
