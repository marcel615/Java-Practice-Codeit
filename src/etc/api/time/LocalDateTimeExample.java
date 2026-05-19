package etc.api.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println(date.getDay());

        System.out.println("==========================================");

        //현재 날짜 정보(연,월,일)
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        System.out.println("==========================================");

        //특정 날짜와 시간 정보 얻기
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("localDateTime1 = " + localDateTime1);

        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        Month month1 = localDateTime.getMonth();
        System.out.println("month = " + month + " " + month1);

        int dayOfMonth = localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("dayOfYear = " + dayOfYear);

        System.out.println("==========================================");

        LocalDateTime d3 = localDateTime.plusDays(3);
        System.out.println("d3 = " + d3);

        //사이 날짜 연산
        LocalDate b = LocalDate.of(2022, 7, 1);
        LocalDate f = LocalDate.of(2023, 4, 2);

        long between = ChronoUnit.DAYS.between(b,f);
        System.out.println("between = " + between);

        System.out.println("==========================================");

        //날짜 포맷 변경하기
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");

        String formatDate = localDateTime.format(dtf);
        System.out.println("formatDate = " + formatDate);
    }
}
