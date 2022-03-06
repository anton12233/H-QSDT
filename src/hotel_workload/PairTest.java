package hotel_workload;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void classTestExcept () throws Exception {

        thrown.expect(Exception.class);
        Pair testPair0 = new Pair(4, 2);
        Pair testPair1 = new Pair(2, 2);
        thrown = ExpectedException.none();

    }
}