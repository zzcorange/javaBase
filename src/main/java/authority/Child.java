package authority;

/**
 * @Author chengzi
 * @Date 2018/8/20 20:55
 */
public class Child extends  Father {
    public void childGetNoAuthString(){
        System.out.println(noAuthString);
    }
    public void childGetPrivateString(){
        //不允许访问父类的私有属性
       // System.out.println(privateString);
    }
    public void ChildGetPublicString(){
        System.out.println(publicString);
    }
    public static void main(String...agrs){
        Child child = new Child();
        child.childGetNoAuthString();
    }
}
