package comn.greatlearning.bracket;
import java.util.*;
public class bracketValidation {
   static boolean BalanceChecker(String expression){
        Stack<Character> stack= new Stack<Character>(); // stack object is created
        char c,character;
        for(int i=0;i<expression.length();i++) {
            character = expression.charAt(i); //fetching each character and storing in variable - character
            if (character == '{' ||  character == '[' || character == '('){ // checks for open brackets
                stack.push(character); // push to stack
                continue;
            }
            if(stack.isEmpty()) //checks for empty stack
               return false;

            switch (character) // encountered when a closing bracket is found
            {
                case ')':
                    c=stack.pop();
                    if(c=='['|| c=='{') // if ')' is inputted then we are confirming that top value on stack is not other brackets([ or {)
                        return false;
                    break;
                case '}':
                    c=stack.pop();
                    if(c=='('|| c=='[')
                        return false;
                    break;
                case ']':
                    c=stack.pop();
                    if(c=='('|| c=='{')
                        return false;
                    break;
            }
        }
        return(stack.isEmpty()); // return true if stack is empty at last step
    }
}