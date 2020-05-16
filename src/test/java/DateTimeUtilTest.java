package leapyear.src.test.java;

import leapyear.src.main.java.DateTimeUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DateTimeUtilTest {

    @Test
    public void givenYear_divisible_by_400_returns_true(){
        assertTrue(DateTimeUtil.isLeapYear(2000));
    }
}
