
//Log file generation

package Java_8_Logger;
import org.apache.log4j.Logger;
public class logger {
	public static void main(String[] args) {
		Logger APPLICATION_LOGS = Logger.getLogger("ApplicationLogger");
		APPLICATION_LOGS.debug("hello");
		APPLICATION_LOGS.debug("We are wrinting in to a log file");
		APPLICATION_LOGS.debug("starting the test case xyz test");
	
	}

}

/* Notes:

//1. add log4j.jar
//2. add below log4j.propertie code directly inside the src folder

Application Logs

#logger name:devpinoyLogger--can change it to any userdefined name
log4j.logger.devpinoyLogger=DEBUG, dest1
log4j.appender.dest1=org.apache.log4j.RollingFileAppender

#size of the file--we can modify
log4j.appender.dest1.maxFileSize=5000KB
log4j.appender.dest1.maxBackupIndex=3
log4j.appender.dest1.layout=org.apache.log4j.PatternLayout

#pattern can change-->dd/MM/yyyy HH:mm:ss
log4j.appender.dest1.layout.ConversionPattern=%d{dd/MM/yyyy HH:mm:ss} %c %m%n
# important-->log file path
log4j.appender.dest1.File=C:\\testing\\Application.log
# if false--->do not append the old file. Create a new log file every time
log4j.appender.dest1.Append=false  

//3. create the object in the code
*/