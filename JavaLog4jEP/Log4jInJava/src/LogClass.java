import org.apache.log4j.*;

/**
 * @author Chris Wong
 * <p>
 * <a href="http://www.tutorialspoint.com/log4j/log4j_logging_levels.htm">LogClass</a>
 * </p>
 */
public class LogClass {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(LogClass.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.setLevel(Level.WARN);

		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
	}

}
