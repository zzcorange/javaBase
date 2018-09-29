package innerclass;

/**
 * @Author chengzi
 * @Date 2018/9/16 15:36
 */
public class DotNew {
    public class Inner{}
    public static void main(String...args){
        //在拥有外部类对象之前是无法创建内部类的 这是因为内部类对象会暗暗链接到创建他的外部类对象中去
//        DotNew.Inner inner = new DotNew.Inner();
        DotNew dn = new DotNew();
        DotNew.Inner inner = dn.new Inner();
    }

}
