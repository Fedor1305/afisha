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

    @Test
    public void test2() {
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
        manager.add("F11");
        manager.add("F12");
        manager.add("F13");

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
                "F10",
                "F11",
                "F12",
                "F13"
        };

        assertArrayEquals(expected,actual);

    }

    @Test
    public void test3() {
        Main manager = new Main();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");

        String[] actual = manager.findAll();
        String[] expected = {
                "F1",
                "F2",
                "F3",
                "F4",
                "F5"

        };

        assertArrayEquals(expected,actual);

    }

    @Test
    public void test4() {
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
        String[] actual = manager.findLast();
        String[] expected = {
                "F10",
                "F9",
                "F8",
                "F7",
                "F6",
                "F5",
                "F4",
                "F3",
                "F2",
                "F1"
        };
        assertArrayEquals(expected,actual);
    }

    @Test
    public void test5() {
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
        manager.add("F11");
        manager.add("F12");
        manager.add("F13");
        manager.add("F14");
        String[] actual = manager.findLast();
        String[] expected = {
                "F14",
                "F13",
                "F12",
                "F11",
                "F10",
                "F9",
                "F8",
                "F7",
                "F6",
                "F5"
        };
        assertArrayEquals(expected,actual);
    }
}
