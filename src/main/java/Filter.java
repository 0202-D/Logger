
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dm.Petrov
 * DATE: 21.08.2022
 */
public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getLogger();
        List<Integer> result;
        result = source.stream().peek(el -> {
            if (el < treshold) {
                logger.log(el + " does not pass");
            } else {
                logger.log(el + " pass");
            }
        }).filter(el -> el >= treshold).collect(Collectors.toList());
        logger.log(result.toString());
        return result;
    }
}

