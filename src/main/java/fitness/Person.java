package fitness;

import fitness.TrainingList.Runing;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement
@XmlType(name = "Person")
@XmlSeeAlso(Runing.class)
public class Person {

    @XmlElement(name = "name")
    private String name;
    @XmlAnyElement
    private final ArrayList<Training> trainingList;

    public Person(){
        this.name = "default";
        this.trainingList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
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
