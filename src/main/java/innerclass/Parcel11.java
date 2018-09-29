package innerclass;

import interfaces.Contents;
import interfaces.Contents;
import interfaces.Destination;

/**
 * @Author chengzi
 * @Date 2018/9/16 16:42
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i =11;
        public int value(){return i;}
    }
    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }
        public String readLabel (){
            return label;
        }
        public static void f(){}
        static int x =10;
        static class AnotherLevel{
            public static void f(){}
            static int  x= 10;
        }
    }
}
