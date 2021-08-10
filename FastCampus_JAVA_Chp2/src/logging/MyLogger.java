package logging;

import java.io.IOException;

/**
 <logging> : 
 - �ý��� ��� ���� ���
 - �α��� �� ����? ������ �߻����� ��, �� ������ ���� ����� ���� ������� �����ϱ� �ϰ� ����. ����, ����� �ܿ� �ý��� ��������, ����, ������ ��� ���� ���� ���
 - ������� ���ر��� �α׸� ���ܾ� �ϳ�?   
     -> �ʹ� ���� �α� : ��Ȯ�� �ý��� ��Ȳ�� �ľ��ϱ� �����
     -> �ʹ� ���� �α� : ����� file I/O�� �������� �α� ������ ������� ���� �߻��� �� ����
 
 <java.util.logging>
 - �ڹٿ��� �����Ǵ� �⺻ log package
 - �����̳� �ֿܼ� �α� ������ ����� �� ����
 - windows - properties - java - Installed JREs�� �ּҿ� conf���� - logging.properties������ �����ؼ� �α� ��¹��, �α� ���� ���� ����
 - logging�к������� �����ϴ� �α� ���� : (high)severe - warning - info - config - fine - finer - finest (low)
                                                                                 <-------------------------------------------------------> config��� �����ϸ� config - info - warning - severe������ �αװ� ��ϵ�.                                                                          
 - ��ǥ���� �α� ���¼ҽ� : log4j 
  
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
		
		logger.addHandler(logFile);  // logging.properties�� level�� Info�� �ٲپ��� ������, ALL�̾ INFO���� �α��.
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
