package stringhomework;

import org.testng.annotations.Test;

public class TestStringDemo {

    // Tests dor Task1
    @Test
    public void testGetCharAtIndex() {
        StringDemo api = new StringDemo();
        String result = api.getCharAtIndex(null, 7);
        assert result.equals(Constants.OUT_OF_BOUNDS);
    }

    // Tests for Test2
    @Test
    public void testCalculateSequenceQuantity() {
        StringDemo api = new StringDemo();
        int result = api.calculateSequenceQuantity("bla blu bla");
        assert result == 3;
    }

    // Tests for Test3
    @Test
    public void testGetReverse() {
        StringDemo api = new StringDemo();
        String result = api.getReverse("aBcBa");
        assert result.equals("Palindrome");
    }

    // Tests for Test4
    @Test
    public void testCheckParenthesis1() {
        StringDemo api = new StringDemo();
        String result = api.checkParenthesis("((()()()))()");
        assert result.equals("Valid");
    }

    @Test
    public void testCheckParenthesis2() {
        StringDemo api = new StringDemo();
        String result = api.checkParenthesis("((())()");
        assert result.equals("Invalid");
    }

    // Tests for Test5
    @Test
    public void testCheckContainSequence() {
        StringDemo api = new StringDemo();
        String result = api.checkContainSequence("PHP Exercises and Python Exercises", "and");
        assert result.equals(String.valueOf(true));
    }

    // Tests for Test6
    @Test
    public void testCheckStartsWith() {
        StringDemo api = new StringDemo();
        String result = api.checkStartsWith("hello", "hell");
        assert result.equals(String.valueOf(true));
    }

    // Tests for Test7
    @Test
    public void testCheckEndsWith() {
        StringDemo api = new StringDemo();
        String result = api.checkEndsWith("hello", "lo");
        assert result.equals(String.valueOf(true));
    }

    // Tests for Test8
    @Test
    public void testRemoveDuplicatedChars() {
        StringDemo api = new StringDemo();
        String result = api.removeDuplicatedChars("resource");
        assert result.equals("resouc");
    }

    // Tests for Test9
    @Test
    public void testSplitStringInEqualParts() {
        StringDemo api = new StringDemo();
        String[] result = api.splitStringInEqualParts("abcdefghijklmnopqrstuvwxy",5);
        assert result[0].equals("abcde");
        assert result[1].equals("fghij");
        assert result[2].equals("klmno");
        assert result[3].equals("pqrst");
        assert result[4].equals("uvwxy");
    }

    // Tests for Test10
    @Test
    public void testReverse() {
        StringDemo api = new StringDemo();
        String result = api.reverse("blu");
        assert result.equals("ulb");
    }
}
