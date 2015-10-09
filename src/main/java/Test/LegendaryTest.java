package Test;

import com.pbz4esilv.gildedrose.Legendary;
import org.junit.Test;

import static org.junit.Assert.*;

public class LegendaryTest {
    Legendary object= new Legendary("name", 20, 60);

    @Test
    public void testUpdateQuality() throws Exception {

        // quality never change for legendary items

        for (int i = 1; i < 4; i++){
            object.UpdateQuality();
        }
        assertEquals(57, object.UpdateQuality());
    }
}