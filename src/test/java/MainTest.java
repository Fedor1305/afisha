import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {

    @Test
    public void test1() {
        Main manager = new Main();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");

        String[] actual = manager.findAll();
        String[] expected = {
                "F1",
                "F2",
                "F3",
                "F4",
                "F5",
                "F6",
                "F7",
                "F8",
                "F9",
                "F10"
        };

        assertArrayEquals(expected,actual);
    }
}
