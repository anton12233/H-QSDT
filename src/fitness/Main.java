package fitness;


import com.google.common.base.Stopwatch;
import fitness.TrainingList.Runing;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, JAXBException, JAXBException {


        Runing run = new Runing();


        Stopwatch stopwatch = Stopwatch.createStarted();
        Thread.sleep(2000);
        stopwatch.stop(); // optional

        long duration = stopwatch.elapsed(TimeUnit.SECONDS);


        Person anton = new Person("Anton");

        Training training = new Training(run, duration);
        anton.addTraining(training);

        anton.addTraining(training);
        anton.addTraining(training);
        anton.addTraining(training);


        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(Person.class,Training.class,Runing.class,trainingInterface.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(anton, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();


        System.out.println(anton.getKcal());
        System.out.println(result);
    }
}
