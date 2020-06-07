import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @org.junit.jupiter.api.Test
    void main() {
        int result = SimpleCalculator.suma(new String[]{"+","2","3"});
        assertEquals(5, result);
        result = SimpleCalculator.suma(new String[]{"+"});
        assertEquals(0, result);
        result = SimpleCalculator.suma(new String[]{"*"});
        assertEquals(-1, result);

    }
}