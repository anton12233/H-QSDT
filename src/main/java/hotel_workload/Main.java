package hotel_workload;

import java.util.ArrayList;

//Представьте себе программную базу данных гостиницы. Есть таблица гости, в каждой строке которой 2 значения - дата заезда,
//дата выезда. Известно, что дата заезда строго меньше даты выезда (снимают номер минимум на одну ночь). Известно так же, номер освобождается утром,
//а новые гости заезжают вечером (обычная практика в гостиницах, пример: {1, 2} - заехали в 1 день, выехали в день 2; другой пример {1, 2}, {2, 3} - заехали в день
// 1 и выехали в день 2, но в тот же день заехали новые гости). Дата заезда представлена целым числом (например, количество дней с начала эпохи). Необходимо написать
// функцию, которая подсчитает максимальное число гостей единомоментно на всех данных в базе.
//
//        Пример сигнатуры функции:
//        int maxGuests(List<Pair<Integer, Integer>> guestsDates)
//
//        Примеры работы функции:
//        assert(maxGuests({}) == 0);
//        assert(maxGuests({{1, 2}}) == 1);
//        assert(maxGuests({{1, 2}, {2, 3}}) == 1);
//        assert(maxGuests({{1, 5}, {0, 1}, {4, 5}}) == 2);


public class Main {
    public static void main(String[] args) {

        ArrayList<Pair> questDates = new ArrayList<>();
        questDates.add(new Pair(1,2));
        questDates.add(new Pair(1,3));
        questDates.add(new Pair(1,4));
        questDates.add(new Pair(3,6));
        questDates.add(new Pair(7,9));

        System.out.println(maxGuests(questDates));
        System.out.println(alr_Merging_segments(questDates));

    }

    //упростить до n
    static int maxGuests(ArrayList<Pair> Pairs){
        int count;
        int maxCount = 0;
        for (Pair firstPair:Pairs) {
            count = 0;
            for (Pair secondPair:Pairs) {
                if(firstPair.isInclude(secondPair))
                count++;
            }
            if (maxCount<count)
                maxCount = count;
        }
        return maxCount;
    }

    static int alr_Merging_segments(ArrayList<Pair> Pairs){

        int maxEaten = 0;

        for (int i = 0; i<Pairs.size();i++){
            for (int j = 1; j<Pairs.size();j++){
                if(Pairs.get(i).isInclude(Pairs.get(j))&&(i!=j)) {
                    Pairs.get(i).setElement0(Math.min(Pairs.get(i).getElement0(),Pairs.get(j).getElement0()));
                    Pairs.get(i).setElement1(Math.max(Pairs.get(i).getElement1(),Pairs.get(j).getElement1()));
                    Pairs.get(i).addEaten(Pairs.get(j).getEaten());
                    maxEaten = Math.max(Pairs.get(i).getEaten(), Pairs.get(j).getEaten());
                    Pairs.remove(Pairs.get(j));
                    j--;
                }
            }
        }


        return maxEaten;
    }



}
