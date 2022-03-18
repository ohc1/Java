package lec11_java_api;

import java.util.Calendar;

public class ApiCalendar {
	private int year;
	private int month;
	private int lastDay;
	private int startDay;
	
	public ApiCalendar(int year, int month) {
		this.year = year;
		this.month = month;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		
		this.lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.startDay = cal.get(Calendar.DAY_OF_WEEK);
	}

	
	public void drawCal() {
	
		System.out.println(year + "�� " + month + "�� �޷�");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		int currentDay = 1;
		
		for (int i = 1; i <= 42; i++) {
			if (i >= startDay) {
				System.out.printf("%2d\t", currentDay);
				currentDay++;

				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}

}