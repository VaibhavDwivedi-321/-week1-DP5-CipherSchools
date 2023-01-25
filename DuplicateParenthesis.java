import java.util.*;
public class DuplicateParenthesis {
    public boolean containsDuplicatePaarenthesis(String expString){
      Stack<Character> stack = new Stack<>();
      
        for(int i =0;i<expString.length();i++){
            Character currentCharacter = expString.charAt(i);
        if(currentCharacter!=')'){
            stack.push(currentCharacter);
        }else{
            int removeElementCount =0;
            Character top = stack.pop();
            while(top!='('){
                top=stack.pop();
                removeElementCount++;
            }
            if(removeElementCount<1){
                return true;
            }
        }
        
        }
        return false;
    }
}
