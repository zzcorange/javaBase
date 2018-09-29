package innerclass;

/**
 * @Author chengzi
 * @Date 2018/9/18 21:15
 */
public class InnerClassExtends extends  InnerClass {
   public innerInInner getInner(){
       return new innerInInner();
   }
   public static void main(String...args){
       InnerClassExtends in =  new InnerClassExtends();
       System.out.println(in.getInner());
   }
}
