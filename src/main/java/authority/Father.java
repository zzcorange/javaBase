package authority;

/**
 * @Author chengzi
 * @Date 2018/8/20 20:36
 *  测试private public protected 的作用范围
 */
public class Father {
    public String publicString="publicString";
    private String privateString="privateString";
    protected  String protectedString="protectedString";
    String noAuthString = "noAuthString";
    private static String staticString  = "staticString";

    public Father(){

    }

    /**
     * 访问内部变量的方法不能用static修饰
     */
    public  void getInFatherString(){
        // 内部类可以直接访问外部类的元素，但是外部类不可以直接访问内部类的元素
        //System.out.println(inFatherString);
        InFather inFather = new InFather();
        inFather.getNoAuth();
    }

    public static void main(String...args){

    }
    /**
     * 测试内部类
     *
     */
    class InFather{
        private String inFatherString = "inFatherString";
        private String innerClassPrivateString;
        // 内部类不允许有static修饰的变量 ，方法    private static String staticString;
        public void getPublicString(){
            System.out.println(publicString);
        }
        public void getPrivateString(){
            System.out.println(privateString);
        }
        public void getProtectString(){
            System.out.println(protectedString);
        }
        public void getNoAuth(){
            System.out.println(noAuthString);
        }
        public void getStaticString(){
            System.out.println(staticString);
        }

    }
}
