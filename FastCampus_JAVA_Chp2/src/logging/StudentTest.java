package logging;

public class StudentTest {

	public static void main(String[] args) throws StudentNameFormatException{
		
		MyLogger mylogger = MyLogger.getLogger();
		
		String name = null;
		
		try {
			Student student = new Student(name);
		} catch (StudentNameFormatException e){
			mylogger.warning(e.getMessage());
			
		}
		
		try {
			Student student = new Student("Edward Jon Kim Test");
		} catch(StudentNameFormatException e){
			mylogger.warning(e.getMessage());
			
		}
		
		Student james = new Student("James");
		String sName = james.getStudentName();
	}

}
