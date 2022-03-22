package lec12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

// ���� ó���� �޼ҵ���� ������ Ŭ����
public class ExMethod {
	
	// �Է¹��� �� ���ڸ� ���� �� ����
	public static int divide(int numA, int numB) throws BizException {
		if(numB == 0) {
			// 
			throw new BizException("numB�� 0 �̿��� ���ڸ� �Է���");
		}else {
			return numA/numB;
		}
	}
	
	// �Է¹��� �̸��� �ֿܼ� ����ϴ� �޼ҵ�
	// ���� �Է¹��� �̸��� ���ڰų�, empty�� throw BizException
	public static void showName(String name) throws BizException {
		String regex = "[a-zA-Z��-�R]*";
		if(name.length() == 0) {
			throw new BizException(ErrConstants.API_0001, "�̸��� �� ���� �̻� �Է����ּ���. �Է��� �� : " + name);
		}else if(!Pattern.matches(regex, name)) {
			throw new BizException(ErrConstants.API_0002, "���ڸ� �Է����� ������. �Է��� �� : " + name);
		}else {
			System.out.println(name);
		}
	}
	
	// ��¥ ���ڿ��� �Է��ϸ� �и��ʷ� �ٲ㼭 ����
	// yyyy.MM.dd
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}
	
	
	
	
	
	
	
	
}