import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by harrymargalotti on Jan/30/18.
 */
class HWFunctionsimplTest {
    @Test
    void add() {
        //PARTITON1 NO NUMBERS
        String test = "";
        HWFunctions myFunctions = new HWFunctionsimpl();
        int result = myFunctions.Add(test);
        assertEquals(0,result);

        //PARTITION2 1 NUMBER
        String test2 = "5";

        //PARTITION 3
    }

}