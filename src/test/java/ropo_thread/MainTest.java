package ropo_thread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void roboTest() throws InterruptedException {
        robo ai = new robo("sam");
        int tempStepDif;

        Main.go(1L, ai);
        tempStepDif = ai.getLeftStepCount()-ai.getRightStepCount();
        assertTrue(((tempStepDif == 0)||(Math.abs(tempStepDif) == 1)));
        Main.go(2L, ai);
        tempStepDif = ai.getLeftStepCount()-ai.getRightStepCount();
        assertTrue(((tempStepDif == 0)||(Math.abs(tempStepDif) == 1)));
        Main.go(3L, ai);
        tempStepDif = ai.getLeftStepCount()-ai.getRightStepCount();
        assertTrue(((tempStepDif == 0)||(Math.abs(tempStepDif) == 1)));
        Main.go(1L, ai);
        tempStepDif = ai.getLeftStepCount()-ai.getRightStepCount();
        assertTrue(((tempStepDif == 0)||(Math.abs(tempStepDif) == 1)));



    }
}