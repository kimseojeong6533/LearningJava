package logging;

import java.io.IOException;

/**
 <logging> : 
 - 시스템 운영에 대한 기록
 - 로깅을 왜 쓰냐? 오류가 발생했을 때, 그 오류에 대한 기록을 남겨 디버깅을 용이하기 하게 위함. 또한, 디버링 외에 시스템 에러추적, 성능, 문제점 향상 등을 위해 사용
 - 어느정도 수준까지 로그를 남겨야 하나?   
     -> 너무 적은 로그 : 정확한 시스템 상황을 파악하기 어려움
     -> 너무 많은 로그 : 빈번한 file I/O의 오버헤드와 로그 파일의 백업문제 등이 발생할 수 있음
 
 <java.util.logging>
 - 자바에서 제공되는 기본 log package
 - 파일이나 콘솔에 로그 내용을 출력할 수 있음
 - windows - properties - java - Installed JREs의 주소에 conf파일 - logging.properties파일을 편집해서 로그 출력방식, 로그 레벨 변경 가능
 - logging패비지에서 제공하는 로그 레벨 : (high)severe - warning - info - config - fine - finer - finest (low)
                                                                                 <-------------------------------------------------------> config라고 설정하면 config - info - warning - severe순으로 로그가 기록됨.                                                                          
 - 대표적인 로그 오픈소스 : log4j 
  
 */


import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	private MyLogger() {
		
		try {
			logFile = new FileHandler(errorLog, true);
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);
			
		} catch (SecurityException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		// ALL : 
		//logger.setLevel(Level.ALL);     
		
		logFile.setLevel(Level.ALL);
		fineFile.setLevel(Level.FINE);
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);  // logging.properties의 level을 Info로 바꾸었기 떄문에, ALL이어도 INFO부터 로깅됨.
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);

	}
	
	public static MyLogger getLogger(){
		return instance;
	}
	
	public void log(String msg){
			
		logger.finest(msg);  
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
			
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
}
