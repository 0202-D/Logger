/**
 * @author Dm.Petrov
 * DATE: 21.08.2022
 */
public class Logger {
    private static Logger logger=null;
    protected int num = 1;

    private Logger() {
    }
    public static Logger getLogger(){
        if(logger ==null){
            logger = new Logger();
        }
        else{
            return logger;
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }
}

