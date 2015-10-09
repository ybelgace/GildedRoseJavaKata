package Test;

import com.pbz4esilv.gildedrose.Normal;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NormalTest {

    Normal object = new Normal("name", 5, 30);

    @Test
    public void testUpdateQuality() throws Exception {

        /** Test for 10 itérations :
         * after 5 iterations : sellIn = 0 quality = 25
         * after 10 iterations : sellIn = -5 quality = 15
         * --> quality expected : 15
         */

        for (int i=1; i<10; i++) {
            object.UpdateQuality();
        }
        assertEquals(14, object.UpdateQuality());
    }
}
