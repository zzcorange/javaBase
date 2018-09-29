package interfaces;

public interface IntefaceTest {
    /**
     * interface中不允许有private
     */
    //private int a = 0;  i
    static int a = 1;
    public static int b = 2;
    /**
     * 方法声明也不允许有private
     */
    //private void test();
    void canFly();
}
