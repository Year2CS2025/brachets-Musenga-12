
import java.util.HashMap;
import java.util.Stack;

public class Balanced{
    public static void main(String[] args) {
        String[] str = {"({[]})","({[})", "((()))", "({)}"};
        for(String s: str)
            System.out.println(isBalanced(s));
        
    }
    public static boolean isBalanced(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');    
        map.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }else if(map.containsValue(c)){
                if(!stack.isEmpty() && map.get(stack.pop()) == c)
                    return true;
            }
        }
        
        return false;
}
        
    
}