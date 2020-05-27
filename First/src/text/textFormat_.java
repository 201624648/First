package text;
import java.text.MessageFormat;
import java.util.Date;
public class textFormat_ {
	public static void main(String[] args) {
		String info="{0}是个学生，今年{1}岁";
		String passInfor=MessageFormat.format(info, "chuxin",20);
		System.out.println(passInfor);
		
		System.out.printf("%s是个学生，今年%d岁", "chuxin",20);
				
	}

}
