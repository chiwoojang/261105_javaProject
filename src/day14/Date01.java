package day14;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 클래스
		// Date 클래스 => Deprecated (비권장)
		// Calendar 클래스 / LocalDate 클래스  로 많이 사용됨.
		Date d = new Date();
		System.out.println(d);  //오늘날짜.
		System.out.println(d.getDate());
		
		Calendar c = Calendar.getInstance();  // 추상클래스여서 new로 생성 불가능
		int year = c.get(Calendar.YEAR);  // 멤버변수 static fianl 
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month+1); //0~11  +1
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year + "-" + (month+1)+"-"+day);
		
		System.out.println("------------------");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(datetime.getYear());
		System.out.println(datetime.getMonth());
		System.out.println(datetime.getMonthValue());
		System.out.println(datetime.getDayOfMonth());
		System.out.println(datetime.getDayOfYear());
		System.out.println(datetime.toLocalDate());
		System.out.println(datetime.toLocalTime());
		
		LocalDateTime birth = LocalDateTime.of(2009, 9,30,8,30);
		System.out.println(birth);
		
		// formatter y M d h m s
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
//		System.out.println(df.format(c));  // 포맷이 맞아야 함.
		
		long days = ChronoUnit.DAYS.between(datetime, birth); // 일 차이
		System.out.println(days);
		long months = ChronoUnit.MONTHS.between(datetime, birth); // 개월차이
		System.out.println(months);
		
		Duration.between(datetime, birth);  // 두 시간 사이 간격
		Period.between(date, date);  // 두 날짜 사이 간격
	
		
	}

}
