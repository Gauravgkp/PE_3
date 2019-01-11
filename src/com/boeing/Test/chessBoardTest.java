import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class chessBoardTest {

    chessBoard chessBoardNew;
    @Before
    public void setUp() throws Exception {
        chessBoardNew = new chessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoardNew = null;
    }

    @Test
    public void chessPatter() {
        //Arrange
        boolean expectedValue =true;
        //Act
        boolean actualValue = chessBoardNew.chessPatter(true);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}