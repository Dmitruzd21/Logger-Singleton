import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;

    protected int num =  1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + new SimpleDateFormat("dd.MM.yyy hh:mm:ss ").format(new Date()) + num++ + "] " + msg);
    }
}
