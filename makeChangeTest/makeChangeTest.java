import Csci232Program3pt2.makeChange;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class makeChangeTest {
    @Test
    void testArrayListCompare(){
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(25);
        test.add(10);
        test.add(5);
        test.add(1);
        test.add(1);
        assertEquals(test, makeChange.makeChange("42"));
    }
    @Test
    void test10(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(10);
        assertEquals(test, makeChange.makeChange("10"));
    }
    @Test
    void negative(){
        ArrayList<Integer> test = new ArrayList<>();
        assertEquals(test, makeChange.makeChange("-1"));
    }
    @Test
    void string(){
        ArrayList<Integer> test = new ArrayList<>();
        assertEquals(test, makeChange.makeChange("String"));
    }

}
