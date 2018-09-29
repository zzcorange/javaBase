package test;
/**
 * @Author chengzi
 * @Date 2018/8/23 21:05
 * 进行一些基础性的java常识测试
 */
import enumtest.TimeEnum;
import  org.junit.Test;

import java.util.HashMap;
import java.util.Random;
public class TestBase {
    @Test
    public void testChangeString(){
      String string = "init";
      changeString( string);
      System.out.println(string);
    }

    public void changeString(String s){
        s=s+" change";
    }
    @Test
    public void testChangeEntity(){
        Entity entity  = new Entity();
        changeEntity(entity);
        System.out.println(entity.getTotal());
    }
    public void changeEntity(Entity entity){
        entity.add();
    }

    @Test
    public void testSystem(){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
    @Test
    public void testInteger(){
        Integer integer =1;
        Integer integer1 =1;
        System.out.println(integer == integer1);
        integer.valueOf(1);
    }

    /**
     * 测试移位功能
     */
    @Test
    public void testyiwei(){
        int i = -1024;
        System.out.println(i>>5);
        System.out.println(i>>>5);
        System.out.println(i=0);
        HashMap hashMap = new HashMap();
        hashMap.put(1,1);
//        while(i=0)
//            System.out.println("come to i=0");
    }
    /**
     * 测试for参数的作用域
     */
    @Test
    public void testFor(){
        for(int i=0;;){
        break;
        }
        for(int i=0;;){

        }

    }
    /**
     * 测试自动生成数组的range方法
     */
    @Test
    public void testRange(){
        //for(int i:range[10]){
        Random random = new Random(26);
        int i=0;
        for(;;){
               System.out.println(random.nextInt(26));

               if(++i>26)return;
        }
    }

    public void testAutoSize(Integer... objects){
        System.out.println("size="+objects.length);
        for(Object o :objects)
            System.out.println(o+"");
    }

    @Test
    public void testAutoSize(){
        //testAutoSize(1,2,3,4,5);
        testAutoSize(1,2,3,4,5);
    }

@Test
    public void testEnum(){
        System.out.println(TimeEnum.jim.toString());
    }

}
