package fitness.TrainingList;

import fitness.trainingInterface;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Runing implements trainingInterface {

    @XmlElement(name = "trainingName")
    private static final String name = "Бег";
    @XmlAttribute(name = "KcalCoef")
    private static final long Kcal = (long) 1.2;

    @Override
    public long getK() {
        return Kcal;
    }
}
