package fitness;

import fitness.TrainingList.Runing;
import fitness.TrainingList.Swimming;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {




    @Test
    void anyTest(){
        Person me = new Person("Gena");

        Training training_1_1 = new Training(new Runing());
        training_1_1.endTrainig(3L);
        me.addTraining(training_1_1);
        Training training_1_2 = new Training(new Runing());
        training_1_2.endTrainig(2L);
        me.addTraining(training_1_2);
        Training training_1_3 = new Training(new Swimming());
        training_1_3.endTrainig(6L);
        me.addTraining(training_1_3);


        ArrayList<Training> testList = new ArrayList<>();

        testList.add(training_1_1);
        testList.add(training_1_2);
        testList.add(training_1_3);

        assertEquals(me.getTrainingList(), testList);
        assertEquals("Gena", me.getName());
        assertEquals(me.getKcal(), (3L * new Runing().getK() + 2L * new Runing().getK() + 6L * new Swimming().getK()));


        me.addTraining(training_1_3);
        assertNotEquals(me.getTrainingList(), testList);
        assertNotEquals("Anton", me.getName());
        assertNotEquals(me.getKcal(), (2L * new Runing().getK() + 2L * new Runing().getK() + 2L * new Swimming().getK()));


    }


}