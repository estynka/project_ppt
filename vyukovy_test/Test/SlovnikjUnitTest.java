import main.Slovnik;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SlovnikjUnitTest {

    Slovnik slovnik;
    Map<Integer, String> mapa;

    public SlovnikjUnitTest(){ slovnik = new Slovnik(); }

    //vytvorime slovnik s nejakymi polozkami
    @Before
    public void setUp(){
        mapa = new HashMap<>();
        mapa.put(111, "Eva");
        mapa.put(112, "Eliska");
    }
    //overime, ze metoda pridava/ zmeni polozky
    @Test
    public void addItem() {
        slovnik.addItem(mapa,113, "Ema");
        assertTrue(mapa.containsKey(113));
        
        slovnik.addItem(mapa, 112, "Kuba");
        assertEquals("Kuba", mapa.get(112) );
    }
    //overime, ze metoda ziskava polozky
    @Test
    public void getValue() {
        assertEquals("Eva", slovnik.getValue(mapa, 111));
    }

    //overime, ze metoda odstranuje polozky
    @Test
    public void removeItem() {
        slovnik.removeItem(mapa, 112);
        assertFalse(mapa.containsKey(112));
        assertNull(mapa.get(112));
    }

    //overime, ze metoda ziskava pocet polozek ve slovniku
    @Test
    public void getSize() {
        int pocet = mapa.size();
        assertEquals(pocet, slovnik.getSize(mapa));
    }
}