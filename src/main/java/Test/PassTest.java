package Test;

import com.pbz4esilv.gildedrose.Pass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PassTest {

    Pass object = new Pass ("Concert de Madonna", 15, 25);

    @Test
    public void testUpdateQuality() throws Exception {

        /** Test for 12 itérations :
         * after 5 iterations : sellIn = 10 quality = 30
         * after 5 iterations : sellIn = 5 quality = 40
         * after the 2 lasts : sellIn = 3 quality = 46
         * --> quality expected : 46
         */

        //for (int i=1; i<12; i++){
        //    object.UpdateQuality();
        //}
        //assertEquals(46, object.UpdateQuality());

        /** Test for 17 itérations :
         * after 5 iterations : sellIn = 10 quality = 30
         * after 10 iterations : sellIn = 5 quality = 40
         * after 13 iterations : sellIn = 2 quality = 49
         * after 15 iterations : sellIn = 0 quality = 49
         * after 17 iterations : sellIn = -2 quality = 0
         * --> quality expected : 46
         */

        for (int i=1; i<13; i++){
            object.UpdateQuality();
        }
        assertEquals(46, object.UpdateQuality());
    }
}