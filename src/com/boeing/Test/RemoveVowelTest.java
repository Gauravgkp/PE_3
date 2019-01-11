import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {

    RemoveVowel removeVowel;
    @Before
    public void setUp() throws Exception {
        removeVowel = new RemoveVowel();
    }

    @After
    public void tearDown() throws Exception {
        removeVowel = null;
    }

    @Test
    public void removeVowel() {
        //Arrange
        boolean expectedValue =true;
        //Act
        boolean actualValue = removeVowel.removeVowel(true);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}