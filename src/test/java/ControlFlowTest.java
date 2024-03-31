import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlFlowTest {
    @Test
    public void test_1() {
        assertEquals(-1, GPA.getGPA(-1));
    }

    @Test
    public void test_2() {
        assertEquals(0, GPA.getGPA(3.9));
    }

    @Test
    public void test_3() {
        assertEquals(1, GPA.getGPA(5.4));
    }

    @Test
    public void test_4() {
        assertEquals(2, GPA.getGPA(6.9));
    }

    @Test
    public void test_5() {
        assertEquals(3, GPA.getGPA(8.4));
    }

    @Test
    public void test_6() {
        assertEquals(4, GPA.getGPA(10));
    }
}
