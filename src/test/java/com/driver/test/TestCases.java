import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TestCases {

    @Test
    void sampleAdditionTest() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        assertEquals(5, sum, "Addition should be correct");
    }

    @Test
    void sampleStringTest() {
        String str = "Hello";
        assertTrue(str.startsWith("H"), "String should start with 'H'");
    }

    @Test
    void sampleArrayTest() {
        int[] arr = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, arr, "Arrays should be equal");
    }
}
