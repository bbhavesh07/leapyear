package leapyear.src.test.java;

import leapyear.src.main.java.DateTimeUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class DateTimeUtilTest {

    @Test
    public void givenYear_divisible_by_400_returns_true(){
        assertTrue(DateTimeUtil.isLeapYear(2000));
    }

    @Test
    public void givenYear_divisible_by_100_and_not_by_400_returns_false(){
        int arr[] = {1700, 1800, 1900, 2100};
        for(int year: arr)
            assertFalse(DateTimeUtil.isLeapYear(year));
    }

    @Test
    public void givenYear_divisible_by_4_and_not_by_100_returns_true(){
        int arr[] = {2008, 2012, 2016};
        for(int year: arr)
            assertTrue(DateTimeUtil.isLeapYear(year));
    }

    @Test
    public void givenYear_not_divisible_by_4_returns_false(){
        int arr[] = {2017, 2018, 2019};
        for(int year: arr)
            assertFalse(DateTimeUtil.isLeapYear(year));
    }
}
