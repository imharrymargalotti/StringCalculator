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

        //--------------PARTITION3 2 NUMBERS--------------------------------------
        //test a: 2 small positive numbers
        String test3A = "5,5";
        int result3A = myFunctions.Add(test2A);
        assertEquals(10,result3A);

        //test b: boundary value of 0 and 1
        String test3B = "0,1";
        int result3B = myFunctions.Add(test3B);
        assertEquals(1,result3B);

        //test c: boundary value of 0 and -1
        String test3C = "0,-1";
        int result3C = myFunctions.Add(test3C);
        assertEquals(1,result3C);

        //test d: small negative numbers
        String test3D = "-5,-5";
        int result3D = myFunctions.Add(test3D);
        assertEquals(-10,result3D);

        //test e: large positive numbers
        String test3E = "10000,10000";
        int result3E = myFunctions.Add(test2E);
        assertEquals(20000,result3E);

        //test f: large negative numbers
        String test3F = "-10000,-10000";
        int result3F = myFunctions.Add(test3F);
        assertEquals(-20000,result3F);

        //test g: positive and negative number
        String test3G = "100,-50";
        int result3G = myFunctions.Add(test3G);
        assertEquals(50,result3G);
    }

}