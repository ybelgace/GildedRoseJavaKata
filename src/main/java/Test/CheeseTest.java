package Test;

import com.pbz4esilv.gildedrose.Cheese;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheeseTest {

    Cheese object = new Cheese("Munster", 10, 3);

    @Test
    public void testUpdateQuality() throws Exception {

        /** Test for 6 itérations :
         * after 6 iterations : sellIn = 4 quality = 9
         * --> quality expected : 9
         */

        for (int i = 1; i < 50; i++) {
            object.UpdateQuality();
        }
        assertEquals(8, object.UpdateQuality());
    }
}