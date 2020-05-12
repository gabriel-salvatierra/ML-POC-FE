package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {

    // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF

    private static final Logger Log = LogManager.getLogger(Log.class.getName());

    public static void debug(String message) {
        Log.debug(" " + message);
    }

    public static void info(String message) {
        Log.info(" " + message);
    }

    public static void error(String message) {
        Log.error(" " + message);
    }

    public static void fatal(String message) {
        Log.fatal(" " + message);
    }
}
