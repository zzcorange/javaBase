package otherpackage;

import basepackage.FatherClass;

/**
 * @Author chengzi
 * @Date 2018/9/8 9:49
 */
public class ChildrenClass extends FatherClass {
    private int number= 0;
    @Override
    public void method3(){
        System.out.println("this is ChildrenClass method3 public");
    }
    public void superFather(){
        super.method3();

    }
    public void add(){
        this.number ++;
    }
    public int getNumber(){
        return number;
    }
    public static void main(String...agrgs){
        ChildrenClass childrenClass = new ChildrenClass();
       // childrenClass.method3();
    childrenClass.superFather();

    }
}
