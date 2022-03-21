package hotel_workload;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static hotel_workload.Main.maxGuests;

class MainTest {

    @Test
    void maxGuestsTest(){
        ArrayList<Pair> questDates1 = new ArrayList<>();
        questDates1.add(new Pair(1,2));

        Assertions.assertEquals(1,maxGuests(questDates1));

        ArrayList<Pair> questDates2 = new ArrayList<>();
        questDates2.add(new Pair(1,2));
        questDates2.add(new Pair(2,3));

        assert(maxGuests(questDates2) == 1);

        ArrayList<Pair> questDates3 = new ArrayList<>();
        questDates3.add(new Pair(1,5));
        questDates3.add(new Pair(0,1));
        questDates3.add(new Pair(4,5));
        assert(maxGuests(questDates3) == 2);

        ArrayList<Pair> questDates4 = new ArrayList<>();
        assert(maxGuests(questDates4) == 0);


    }

}