package fitness;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;


@XmlRootElement
@XmlType(name = "Person")
public class Person {

    private final String name;
    private final ArrayList<Training> trainingList;


    public Person(String name) {
        this.name = name;
        this.trainingList = new ArrayList<Training>();
    }

    public String getName() {
        return name;
    }

    public void addTraining(Training training){
        this.trainingList.add(training);
    }

    public long getKcal(){
        long kcalSum = 0;

        for (Training training:this.trainingList) {
            kcalSum += training.getTraining().getK()*training.getDurationTraining();
        }
        return kcalSum;
    }

}
