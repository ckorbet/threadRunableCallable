import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO

/*
 * This is a Groovy DLS Descriptior for LogBack configuration
 */

appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} [%-15thread] %-5level: %-17msg [%logger.%method\\(\\): %line]%n"
  }
}
root(DEBUG, ["STDOUT"])