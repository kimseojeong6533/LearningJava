package first;
import java.util.Calendar;
public class switchExam2 {

	public static void main(String[] args) {
		//switch�� ������� : switch, case, default, break
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        
        // ������ ���� case���� �ѹ��� ����ϸ� �� ª�� �ڵ带 © �� �ֽ��ϴ�.
        switch(month) {
            case 1:
            case 2:
            case 12:
                season = "�ܿ�";
                break;
            case 3:
            case 4:
            case 5:
                season = "��";
                break;
            case 6:
            case 7:
            case 8:
                season = "����";
                break;
            case 9:
            case 10:
            case 11:
                season = "����";
                break;
        }
        System.out.println("������ " + month + "���̰�, " + season + "�Դϴ�.");
	}

}


