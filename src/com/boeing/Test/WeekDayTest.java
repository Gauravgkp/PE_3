import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekDayTest {

    WeekDay weekDay;
    @Before
    public void setUp() throws Exception {
        weekDay = new WeekDay();
    }

    @After
    public void tearDown() throws Exception {
        weekDay=null;
    }

    @Test
    public void weekDay() {
        //Arrange
        boolean expectedValue =true;
        //Act
        boolean actualValue = weekDay.weekDay(true);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}