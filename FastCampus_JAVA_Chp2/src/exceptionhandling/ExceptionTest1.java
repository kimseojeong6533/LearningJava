package exceptionhandling;

/**
 <예외 처리>
 -예외 처리는 왜 하나?
 
     1. 프로그램에서의 오류(compile error)
     	-프로그램 코드 작성 중, 발생하는 문법적 오류
     	-최근에는 개발환경(eclipse)에서 대부분의 컴파일 오류는 detection 됨. 
     	
 	 2. 실행오류(runtime error)
 	 	- 실행중인 프로그램이 의도하지 않은 동작(bug)을 하거나 프로그램이 중지되는 오류
 	 	- 실행오류로 비정상종료가 되는 경우, 시스템에 심각한 장애가 발생할 수 있음. 
 
    => 프로그램의 비정상종료를 피하여, 시스템이 원활하게 실행되도록 함
    	 오류 발생시, log를 남겨서 추후 log분석을 통해 그 원인을 파악하여 버그를 수정하는 것이 중요하다!
    	 
                                Throwable(상위클래스)
              Error(하위클래스)       Exception(하위클래스) 
                     
          * Error(시스템오류) : 가상머신에서 발생, 프로그래머가 처리할 수 없는 오류. ex. 스택 오버플로우 등
          * Exception(예외) : 프로그래머가 제어할 수 있는 오류, ex. 읽으려는 파일이 존재하지 않거나, 네트워크 or DB연결이 안되는 경우
          
                   
                      
   
 */


public class ExceptionTest1 {
	Exception e;
	
	/**
	 
	 Exception 클래스 : 모든 예외 클래스의 최상위 클래스 
	    java.lang.Object
	    	java.lang.Thorwable
	    		java.lang.Exception
	
	* JAVA에서는 다양한 예외를 처리하기 위한 클래스가 제공되고 있음. Document참고 
	 */
	
	
}
