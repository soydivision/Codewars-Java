package break_the_camel_case;

public class BreakTheCamelCase {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char val = input.charAt(i);
            if (Character.isLowerCase(val)) {
                sb.append(val);
            } else {
                sb.append(" ");
                sb.append(val);
            }
        }
        return sb.toString();
    }
}
