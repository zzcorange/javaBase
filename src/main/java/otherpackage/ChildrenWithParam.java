package otherpackage;

import basepackage.FatherWithParam;

/**
 * @Author chengzi
 * @Date 2018/9/10 21:17
 */
public class ChildrenWithParam extends FatherWithParam {
    private final  String a="121";
    private final ChildrenClass childrenClass ;
     static String b = "12";
    public ChildrenWithParam() {
        super("","");
        childrenClass= new ChildrenClass();
    }
    public final  void method(){
        System.out.println("final");
    }
    public static void methodStatic(){
        System.out.println("static");
    }
    public void changeChildrenClass(){
        System.out.println("before change:"+childrenClass.getNumber());
        childrenClass.add();
        System.out.println("after change"+childrenClass.getNumber());
        //childrenClass = new ChildrenClass();  // 不能修改对象的指向
    }
    public static void main(String...args){
        //method();
        new ChildrenWithParam().changeChildrenClass();
        methodStatic();
    }
}
