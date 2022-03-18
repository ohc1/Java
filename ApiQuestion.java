package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import lec09_class.UtilClass;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// �پ��� ��¥ ���� ����
		// �ð�� ������� �پ��� ������ �ð���� �ֱ���.
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 ���� 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. �� ���� 02:17:20
		// 5. ����� 14:17:20
		// 6. Thu PM 02:17:20
		// �� ������ �ð���� �����е� ����� �� ������ �� ������.
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String strDay = sdf.format(date);
		System.out.println("1. " + strDay);
		
		SimpleDateFormat sdf2
			= new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		strDay = sdf2.format(date);
		System.out.println("2. " + strDay);
		
		SimpleDateFormat sdf3
			= new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
		strDay = sdf3.format(date);
		System.out.println("3. " + strDay);
		
		SimpleDateFormat sdf4
			= new SimpleDateFormat("yyMMdd E hh:mm:ss");
		strDay = sdf4.format(date);
		System.out.println("4. " + strDay);
		
		SimpleDateFormat sdf5
			= new SimpleDateFormat("E���� HH:mm:ss");
		strDay = sdf5.format(date);
		System.out.println("5. " + strDay);
		
		SimpleDateFormat sdf6
			= new SimpleDateFormat("E a hh:mm:ss", Locale.ENGLISH);
		strDay = sdf6.format(date);
		System.out.println("6. " + strDay);
		
		// ���� �̱� ��¥��?
		SimpleDateFormat sdf7
			= new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss", Locale.ENGLISH);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf7.setTimeZone(timeZone);
		strDay = sdf7.format(date);
		System.out.println("7. " + strDay);
		
		System.out.println("\n=============================\n");
		
		// ���� ����
		// �Ķ���ͷ� ��¥�� �Է¹�����(String, yyyy.MM.dd ����)
		// ���ó�¥�� �ش� ��¥�� ���̸� ���Ͽ�
		// ���� ���� (10�� �������� 10, 10�� �������� -10)
		
		// 2022.04.01 ��������� ���� ���Ҵ��� (= 15)
		// 2022.02.14 ó�� �� ������ ���� �������� (= -31)
		System.out.println("��������ϱ��� D-day = " 
				+ calDday("2022.04.01"));
		System.out.println("�п� ó�� �³����� " 
				+ calDday("2022.02.14") + "�� ����");
		
		System.out.println("\n======================================\n");
		
		// �޷��� ������ִ� Ŭ������ ����� �ּ���.
		ApiCalendar apiCal = new ApiCalendar(2022, 6);
		apiCal.drawCal();
		
		
		System.out.println("\n======================================\n");
		
		// ����ũ ID ����
		// 6�ڸ��� ���� ���ڸ� �̿��ؼ� �����?
		
		// yyyyMMddHHmmssSSS + ������ 6
		System.out.println("Guest" + UtilClass.makeUniqueId()+"�� ȯ���մϴ�.");
		System.out.println("Guest" + UtilClass.makeUniqueId()+"�� ȯ���մϴ�.");
		System.out.println("Guest" + UtilClass.makeUniqueId()+"�� ȯ���մϴ�.");
		
		
		
	} // main ��
	
	
	
	static long calDday(String dday) throws ParseException {
		// ���� ��¥ ���ϱ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date today = new Date();	// 2022.03.17 16:33:30 ���õ� ��ü
		// 2022.03.18 00:00:00 - 2022.03.17 16:33:30 = 8�ð�(X)
		// 2022.03.17 00:00:00 ����� �־�� ��¥(��) ��� ����
		String strToday = sdf.format(today);
		// strToday = 2022.03.17 ���ڿ�
		Date sdfToday = sdf.parse(strToday);
		// sdfTday = 2022.03.17 00:00:00 ���õ� Date ��ü
		
		Date inputDay = sdf.parse(dday);
		
		long diffMillSec = inputDay.getTime() - sdfToday.getTime();
		long diffDay = diffMillSec / (1000 * 60 * 60 * 24);
		
		return diffDay;
	}
	
}