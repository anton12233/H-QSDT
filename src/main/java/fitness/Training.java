package fitness;

import fitness.TrainingList.Runing;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Training {

    @XmlElement(name = "training")
    @XmlElements(value = {
            @XmlElement(name="runing",
                    type= Runing.class)
    })
    private trainingInterface training;
    @XmlAttribute(name = "duration")
    private long durationTraining;

    public Training() {
        super();
    }

    public void setTraining(trainingInterface setTraining, long durationTraining) {
        this.durationTraining = durationTraining;
        this.training = setTraining;
    }


    public long getDurationTraining() {
        return durationTraining;
    }

    public trainingInterface getTraining() {
        return training;
    }
}
