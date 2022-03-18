package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiDate {
	public static void main(String[] args) throws ParseException {
		// ���� �ð�
		// 1. Date Ŭ���� ���
		Date dateToday = new Date();
		// Date ��ü�� �����Ǵ� ����
		// �ش� Date ��ü ���ο� �� ���� �ð��� ���õȴ�.
		System.out.println(dateToday);
		
		// ��¥ ���� ����
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH��mm��ss��");
		String strToday = dateFormat.format(dateToday);
		System.out.println(strToday);
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(dateToday);
//		Date newDate = new Date();
//		System.out.println(newDate);
		
		// 2. Calendar Ŭ���� ���
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday);
		System.out.println(calToday.getTime());
		
		// ��¥ ���� ����
		strToday = dateFormat.format(calToday.getTime());
		System.out.println(strToday);
		
		System.out.println("\n================================\n");
		
		// 3. System Ŭ���� ���
		// 1970�� 1�� 1�Ϻ��� ��������� ����� �ð��� 
		// �и��� ������ ����
		System.out.println(System.currentTimeMillis());
		strToday = dateFormat.format(System.currentTimeMillis());
		System.out.println(strToday);
		
		// .format() �ȿ� long Ÿ�� ������ �Է��ϸ�
		// 1970�� 1�� 1�� �������� �ش� millSec�� ���� ��¥�� �ν� 
		strToday = dateFormat.format(1647493941095L);
		System.out.println(strToday);
		
		System.out.println("\n==============================\n");
		
		// �پ��� ��¥ Ÿ�� �����
		// ApiQuestion ���� ��..
		
		System.out.println("\n==============================\n");
		
		// ��¥(Ÿ��) <-> ���ڿ�(Ÿ��) �ٲٱ�
		String strTomorrow = "2022-03-18 14:23:22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// .parse ���ڿ��� Date Ÿ������ ��ȯ
		Date dateTomorrow = sdf.parse(strTomorrow);
		// �ش� ���ڿ� ��¥�� ���õ� Date ��ü ����
		System.out.println(dateTomorrow);
		
		String strTime = "11:20:33";
		sdf = new SimpleDateFormat("HH:mm:ss");
		Date dateTime = sdf.parse(strTime);
		System.out.println(dateTime);
		// ���ڿ��� ���ԵǾ� ���� ���� ��,��,����
		// �⺻���� 1970�� 1�� 1�Ϸ� �Ǿ��ִ�.
		
		String strYear = "2022.03.17";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date dateYear = sdf.parse(strYear);
		System.out.println(dateYear);
		// ���ڿ��� ���ԵǾ� ���� ���� ��,��,��,�и��ʴ�
		// �⺻���� 0���� �Ǿ��ִ�.
		
		System.out.println("\n==============================\n");
		
		// ��¥ �����ϱ�
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		// ��(Month)�� ��� 1���� 0, 2���� 1 , ... ���� �Ǿ��ִ�.
		cal.set(2021, 2, 14, 12, 30, 21);
		String printCal = sdf.format(cal.getTime());
		System.out.println(printCal);
		
		// Date Ÿ���� Calendar�� ��ȯ
		Date temp = new Date();
		cal.setTime(temp);
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("\n================================\n");
		
		// ��¥ ����
		long diffMillSec = dateTime.getTime() - dateYear.getTime();
		System.out.println(diffMillSec);
		
		long diffSec = diffMillSec / 1000;
		System.out.println(diffSec);
		
		long diffMin = diffSec / 60;
		System.out.println(diffMin);
		
		long diffHour = diffMin / 60;
		System.out.println(diffHour);
		
		long diffDay = diffHour / 24;
		System.out.println(diffDay);
		
		long diffYear = diffDay / 365;
		System.out.println(diffYear);
		
		long diff = diffMillSec / (1000 * 60 * 60 * 24);
		System.out.println(diff);
		
		// Calendar ���
		// �� ��¥�� �������� ��¥�� ���ϰų� �� �� ����
		
		// Calendar ���� ��¥+�ð����� �ʱ�ȭ 
		cal.setTime(new Date());
		System.out.println(sdf.format(cal.getTime()));
		
		// 3�� ��
		cal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(cal.getTime()));
		
		// 11�� ��
		cal.add(Calendar.MONTH, 11);
		System.out.println(sdf.format(cal.getTime()));
		
		// 7�� ��
		cal.add(Calendar.DATE, -7);
		System.out.println(sdf.format(cal.getTime()));
		
		// Calendar�� Date�� ��ȯ
		Date dateCal = cal.getTime();
		System.out.println(sdf.format(dateCal));
		
		
		System.out.println("\n================================================\n");	
		
		// Calendar�� getInstance()�� �̱����� �ƴ϶�
		// ���ο� Calendar ��ü�� �����Ѵ�.
		Calendar calTest = Calendar.getInstance();
		// new Date() ó�� ����� ����� �ð��� ���õ� ��ü�� ������.
		System.out.println(sdf.format(calTest.getTime()));
		
		calTest.add(Calendar.DATE, 1);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// ��� : Window - Preferences - Java - Code Style
		// - Code Templates - Code - Method body ����
		// Edit �� �ּ� �κ� ����.
		
		System.out.println(sdf.format(calTest.getTime()));
		Calendar calTest2 = Calendar.getInstance();
		System.out.println(sdf.format(calTest2.getTime()));
		System.out.println(calTest.hashCode());
		System.out.println(calTest2.hashCode());
		
		System.out.println("\n================================================\n");
		
		// �޷� �����
		int year = 2022;
		int month = 4;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		System.out.println(sdf.format(calendar.getTime()));
		
		// �ش� ���� ������ ��(DATE)�� �����մϴ�. DAY_OF_MONTH
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		// �ش� ���� ���� ����( 1: �Ͽ���, 2: ������, ... 7: �����) DAY_OF_WEEK
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		System.out.println(year + "�� " + month + "�� �޷�");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		int currentDay = 1;
		
		for(int i = 1; i <= 42; i++) {
			if(i >= startDay) {
				System.out.printf("%2d\t",currentDay);
				currentDay ++;
				
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
	}
}