package staticInitial;

/**
 * @Author chengzi
 * @Date 2018/9/1 15:06
 */
public class StaticInitialization {
    public static void main(String... args){
        System.out.println("Creating new CUpboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
