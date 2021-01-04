package pointsandlines;

import org.testng.annotations.Test;

public class TestHomeworkHelper {

    @Test
    public void testIsStringHasLowCase() {
        Boolean result = HomeworkHelper.isStringHasLowCase("Asa");
        assert result.equals(true);

        result = HomeworkHelper.isStringHasLowCase("  ");
        assert result.equals(true);

        result = HomeworkHelper.isStringHasLowCase(" S ");
        assert result.equals(true);

        result = HomeworkHelper.isStringHasLowCase("aSA");
        assert result.equals(true);

        result = HomeworkHelper.isStringHasLowCase("A");
        assert result.equals(false);
    }

}
