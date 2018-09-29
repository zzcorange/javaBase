package holding;

import java.util.Stack;

/**
 * @Author chengzi
 * @Date 2018/9/27 21:19
 */
public class StackTest {
    public static void main(String...args){
        String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        Stack<String> stack = new Stack<String>();
        for(int i =0;i<string.length();i++){
            if(string.charAt(i)=='+')
                stack.push(string.charAt(++i)+"");
            if(string.charAt(i)=='-')
            {
                System.out.println(stack.pop());
            }
        }

    }
}
