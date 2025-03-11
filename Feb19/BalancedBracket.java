package Feb19;

public class BalancedBracket {
 
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false; //yha pe closing bracket
                }
                char opening = st.pop();
                if ((ch == ')' && opening != '(') || 
                    (ch == ']' && opening != '[') || 
                    (ch == '}' && opening != '{')) {
                    return false; // Mismatched vali bracket
                }
            }
        }
        return st.isEmpty(); // Stack apka empty hona chyia agr brackets match kr rhy hain
    }
}


