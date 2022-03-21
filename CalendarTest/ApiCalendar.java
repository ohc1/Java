package submit03.submit_02;

import java.util.Calendar;

public class ApiCalendar {
	private int year;
	private int month;
	private int lastDay;
	private int startDay;
	
	public ApiCalendar(int y, int m) {
		this.year = y;
		this.month = m;
		Calendar calendar = Calendar.getInstance();
		calendar.set(y, m-1,1);
		this.lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.startDay = calendar.get(Calendar.DAY_OF_WEEK);
	}
	
	public void draWeekDay() {
		System.out.println(year + "년 " + month +"월 달력 (주말제외)");
		System.out.println("월\t화\t수\t목\t금");
		
		int cDay = 1;
		for(int i = 1; i <= 42; i++) {
			if(i >= startDay - 1) {
				System.out.printf("%2d\t",cDay);
				cDay++;
				if(i % 5 == 0) {
					cDay+=2;
				}
				if(cDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
		
	}
	
	
}