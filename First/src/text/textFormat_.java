package text;
import java.text.MessageFormat;
import java.util.Date;
public class textFormat_ {
	public static void main(String[] args) {
		String info="{0}�Ǹ�ѧ��������{1}��";
		String passInfor=MessageFormat.format(info, "chuxin",20);
		System.out.println(passInfor);
		
		System.out.printf("%s�Ǹ�ѧ��������%d��", "chuxin",20);
				
	}

}
