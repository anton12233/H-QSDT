package anti_aa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void check(){
        assertEquals("[]", Main.delAAStack("aabb"));
        assertEquals("[abfbaf]", Main.delAAStack("abfbaf"));
        assertEquals("[f]", Main.delAAStack("abccbaf"));
        assertEquals("[b]", Main.delAAStack("aab"));
        assertEquals("[]", Main.delAAStack(""));

    }

}