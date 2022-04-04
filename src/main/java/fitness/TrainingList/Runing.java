package fitness.TrainingList;
import fitness.trainingInterface;
import java.io.Serializable;

public class Runing implements trainingInterface, Serializable {
    private static final String name = "Runing";
    private static final long Kcal = 2L;

    @Override
    public long getK() {
        return Kcal;
    }
    public String getName() {return name;}
}
