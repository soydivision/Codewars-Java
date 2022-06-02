package valid_parentheses;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class Test {
    @org.junit.Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(true, ValidParenthese.validParentheses("()"));
        assertEquals(false, ValidParenthese.validParentheses("())"));
        assertEquals(true, ValidParenthese.validParentheses("32423(sgsdg)"));
        assertEquals(false, ValidParenthese.validParentheses("(dsgdsg))2432"));
        assertEquals(true, ValidParenthese.validParentheses("adasdasfa"));
        assertEquals(false, ValidParenthese.validParentheses("<cr[.Rs)z)()c(FX`2(():WkS"));
        assertEquals(false, ValidParenthese.validParentheses("())("));
        assertEquals(true, ValidParenthese.validParentheses("()()"));
    }
}
