package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {

    private static final Logger logger = LogManager.getLogger(demo.class) ;

    public static void main(String [] args){
        System.out.println("Hello");
        logger.trace("this is a trace message");
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is an error message") ;
        logger.fatal("this is a fatal message");
    }



}
