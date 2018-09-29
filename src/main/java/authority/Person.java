package authority;

/**
 * @Author chengzi
 * @Date 2018/8/20 20:58
 */
public class Person {
    public static void main(String...args){
        Father father = new Father();
        System.out.println(  father.noAuthString);
        System.out.println(  father.protectedString);
        System.out.println(  father.publicString);
        //私有属性同包其他元素不允许访问
        //System.out.println(  father.privateString);
    }
}
