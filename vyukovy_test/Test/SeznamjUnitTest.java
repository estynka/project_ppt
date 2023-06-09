import main.Seznam;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class SeznamjUnitTest {

    Seznam seznam;
    List<String> list;

    public SeznamjUnitTest(){
        seznam = new Seznam();
    }

    //vytvorime seznam s nejakymi prvky
    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
    }

    // ověříme, že první prvek má index 0
    @Test
    public void test_getIndex_0() {
        int result = seznam.getIndex(list, "a");
        assertEquals(0, result);
    }
    //overime index vnitrniho prvku
    @Test
    public void test_getIndex_common() {
        int result = seznam.getIndex(list, "c");
        assertEquals(2, result);
    }
    //overime neexistenci prvku
    @Test
    public void test_getIndex_negative() {
        int result = seznam.getIndex(list, "z");
        assertEquals(-1, result);
    }

}