import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    @Test
    void test () throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6,Triangle.countArea(3,4,5));
    }

    @ParameterizedTest
    @CsvSource({"3,2,3,2","7,8,9,26","10,10,10,43"})
    void testWithCsvSource(int a, int b, int c, int result) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(result,Triangle.countArea(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({"4,-5,6,MyException: It's not a triangle","7,8,-9,MyException: It's not a triangle","10,0,12,MyException: It's not a triangle"})
    void testWithCsvSourceNew(int a, int b, int c, String result) throws MyException {
        Triangle triangle = new Triangle();
        assertThrows(MyException.class, () -> {
            Triangle.countArea(a, b, c);
        });
    }
}


