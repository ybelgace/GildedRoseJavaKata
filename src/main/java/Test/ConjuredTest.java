package Test;

import com.pbz4esilv.gildedrose.Conjured;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConjuredTest {

    Conjured object = new Conjured("name", 10, 30);


    @Test
    public void testUpdateQuality() throws Exception {

        /** Test for 12 itérations :
         * after 10 iterations : sellIn = 0 quality = 10
         * after 12 iterations : sellIn = -2 quality = 2
         * --> quality expected : 2
         */

        for (int i=1; i<12; i++){
            object.UpdateQuality();
        }
        assertEquals(3, object.UpdateQuality());
    }
}