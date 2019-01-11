import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    Matrix matrix;
    @Before
    public void setUp() throws Exception {
        Matrix matrix = new Matrix();
    }

    @After
    public void tearDown() throws Exception {
        matrix=null;
    }

    @Test
    public void matrixSum() {
        //Arrange
        int [][]  expectedValue ={{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        int [][] matrixOne = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] matrixTwo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //Act
        int [][] actualValue = matrix.matrixSum(matrixOne, matrixTwo) ;

        //Assert
        assertArrayEquals(expectedValue, actualValue);
    }

}

