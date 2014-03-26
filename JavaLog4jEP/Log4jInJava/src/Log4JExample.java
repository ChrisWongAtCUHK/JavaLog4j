import org.apache.log4j.Logger;

/**
 * <p>
 * <a href="http://www.tutorialspoint.com/log4j/log4j_sample_program.htm">Log4JExample</a>
 * </p>
 */
public class Log4JExample {

	static Logger log = Logger.getLogger(Log4JExample.class.getName());

	public static void main(String[] args) {

		log.debug("Hello this is an debug message");
		log.info("Hello this is an info message");
	}

}
