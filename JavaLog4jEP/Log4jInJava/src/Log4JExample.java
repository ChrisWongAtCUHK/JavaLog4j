import org.apache.log4j.Logger;

/**
 * A simple Java Log4j example class.
 * 
 */
public class Log4JExample {

	static Logger log = Logger.getLogger(Log4JExample.class.getName());

	public static void main(String[] args) {

		log.debug("Hello this is an debug message");
		log.info("Hello this is an info message");
	}

}
