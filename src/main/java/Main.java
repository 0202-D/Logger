import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 21.08.2022
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        List<Integer> source = new ArrayList<>();
        logger.log(LocalDateTime.now() + " start program");
        int listSize = 0;
        int upperLevel = 0;
        int filter = 0;
        System.out.println("Hello, enter two prime numbers. The first is the size of the list, the second is the upper limit");
        try {
            listSize = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            logger.log(LocalDateTime.now() + " the user entered an incorrect array size");
        }
        try {
            upperLevel = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            logger.log(LocalDateTime.now() + " the user entered an incorrect upper limit");
        }
        logger.log(LocalDateTime.now() + " fill list");
        source = fillTheList(source, listSize, upperLevel);
        logger.log(LocalDateTime.now() + " " + source + " here random list");
        System.out.println("please enter digit - filter");
        try {
            filter = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            logger.log(LocalDateTime.now() + " the user entered an incorrect filter");
        }
        logger.log(LocalDateTime.now() + " filter : " + filter);
        Filter filter1 = new Filter(filter);
        source = filter1.filterOut(source);
        logger.log(LocalDateTime.now() + " here filtered list : " + source);
        logger.log(LocalDateTime.now() + " finish program");


    }

    public static List<Integer> fillTheList(List<Integer> list, int listSize, int upperLevel) {
        Random rand = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(rand.nextInt(upperLevel));
        }
        return list;
    }
}
