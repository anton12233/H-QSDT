package hotel_workload;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PairTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    void ExceptTest() {
        thrown.expect(Exception.class);
        Pair testPair0 = new Pair(4, 2);
        Pair testPair1 = new Pair(2, 2);
        thrown = ExpectedException.none();
    }

    @Test
    void isIncludeTest(){
        Pair testPair1 = new Pair(2,10);
        Pair testPair2 = new Pair(1,4);
        Pair testPair3 = new Pair(4,6);
        Pair testPair4 = new Pair(6,11);
        Pair testPair5 = new Pair(1,11);

        Pair testPair6 = new Pair(1,2);
        Pair testPair7 = new Pair(10,11);
        Pair testPair8 = new Pair(11,12);
        Pair testPair9 = new Pair(0,1);


        assertTrue(testPair1.isInclude(testPair2));
        assertTrue(testPair1.isInclude(testPair3));
        assertTrue(testPair1.isInclude(testPair4));
        assertTrue(testPair1.isInclude(testPair5));

        assertFalse(testPair1.isInclude(testPair6));
        assertFalse(testPair1.isInclude(testPair7));
        assertFalse(testPair1.isInclude(testPair8));
        assertFalse(testPair1.isInclude(testPair9));


    }

}