package basepackage;

/**
 * @Author chengzi
 * @Date 2018/9/13 21:16
 */
public class TestChild extends  TestSuper {
    private int a= PrintInt.printChild();
     TestChild(){
         super(1);
         System.out.println("In testChild构造器");

    }
    public static void print(){
        System.out.println("I am child print");
    }
    public static void main(String...arg){
//        TestSuper testSuper = new TestChild();
//        testSuper.print();
        TestChild testChild = new TestChild();
//        testChild.print(); //static 中赋值。非多态
    }
}
