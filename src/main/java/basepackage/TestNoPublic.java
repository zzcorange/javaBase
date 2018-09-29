package basepackage;

/**
 * @Author chengzi
 * @Date 2018/9/8 10:09
 */
public class TestNoPublic {
    public void test(){
        System.out.println("testNoPublic");
    }

    /**
     * 这个内部类是类的内部类，不能被外界的类访问
     * 这个内部类可以用private，protect修饰
     * 不同之处于，private 不允许被子类访问，protect可以被子类访问
     */
    class a{
        public void who(){
            System.out.println("I am A");
        }
    }
}

/**
 * 这个内部类是包访问权限的，可以被同包的其他类访问，但不能被其他非同包的类访问
 */
class b{
    public void who(){
        System.out.println("I am B");
    }
}
