import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by harrymargalotti on Jan/30/18.
 */
class HWFunctionsimplTest {
    @Test
    void add() {
        //--------------PARTITON1 NO NUMBERS-------------------------------------
        String test = "";
        HWFunctions myFunctions = new HWFunctionsimpl();
        int result = myFunctions.Add(test);
        assertEquals(0,result);

        //--------------PARTITION2 1 NUMBER--------------------------------------
        //test a: small positive number
        String test2A = "5";
        int resultA = myFunctions.Add(test2A);
        assertEquals(5,resultA);

        //test b: boundary value of 0
        String test2B = "0";
        int resultB = myFunctions.Add(test2B);
        assertEquals(0,resultB);

        //test c: small negative number
        String test2C = "-5";
        int resultC = myFunctions.Add(test2C);
        assertEquals(-5,resultC);

        //test d: large positive number
        String test2D = "10000";
        int resultD = myFunctions.Add(test2D);
        assertEquals(10000,resultD);

        //test e: large negative number
        String test2E = "-10000";
        int resultE = myFunctions.Add(test2E);
        assertEquals(-10000,resultE);

        //--------------PARTITION3-----------------------------------------------
    }

}