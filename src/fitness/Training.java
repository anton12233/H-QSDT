package fitness;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class Training {

    @XmlElement(name = "training")
    private final trainingInterface training;
    @XmlAttribute(name = "duration")
    private final long durationTraining;

    public Training(trainingInterface training, long durationTraining) {
        this.training = training;
        this.durationTraining = durationTraining;
    }

    public long getDurationTraining() {
        return durationTraining;
    }

    public trainingInterface getTraining() {
        return training;
    }
}
