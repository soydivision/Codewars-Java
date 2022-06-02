package valid_parentheses;

public class ValidParenthese {
    public static boolean validParentheses(String parens) {
        int count = 0;
        char[] charArray = new char[parens.length()];
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                count++;
            } else if (parens.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        if (count == 0) return true;
        else return false;

    }
}
