package basepackage;

import javax.annotation.Resource;

/**
 * @Author chengzi
 * @Date 2018/9/13 21:39
 */
public class PolyConstructors {
    class Glyph{
        void draw(){System.out.println("Glyph.draw()");}
        Glyph(){
            System.out.println("Glyph() before draw()");
            draw();
            System.out.println("Glyph() after draw()");
        }

    }
    class RoundGlyph extends  Glyph{
        private int radius = 1;
        RoundGlyph(int r){
            radius = r;
            System.out.println("RoundGlyph.RoundGlyph();radius =  "+radius);
        }
        @Override
        void draw(){
            System.out.println("RoundGlyph.draw();radius= " +radius);
        }

    }
    public static void main(String...args){
       new PolyConstructors(). new RoundGlyph(5);
    }
}
