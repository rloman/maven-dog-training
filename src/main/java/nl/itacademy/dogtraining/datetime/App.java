package nl.itacademy.dogtraining.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {
        demoAssignmentLocalDateTime();

    }

    public static void demoAssignmentLocalDateTime() {

        LocalDateTime ray = LocalDateTime.of(1968, 8,9, 15,30);
        long minutes = ChronoUnit.MINUTES.between(ray, LocalDateTime.now());

        Duration duration = Duration.between(ray, LocalDateTime.now());

        System.out.println(LocalDateTime.now().plus(duration));

    }

    public static void demoLocalDateTime() {

        LocalDateTime vertrek = LocalDateTime.of(2019, 7, 28, 10, 38);
        LocalDateTime aankomst = LocalDateTime.of(2019, 8, 15, 14, 38);

        long minutes = ChronoUnit.MINUTES.between(vertrek, aankomst);


        System.out.println(aankomst.plusMinutes(minutes).getDayOfWeek());

        // how to convert a LocalDate to LocalDateTime
        LocalDateTime thisDayMidnight = LocalDate.now().atStartOfDay();


        LocalDate bas = LocalDate.of(1976, 2, 27);

        long epoch = bas.toEpochDay();

        System.out.println(epoch);

        Period threeDays = Period.ofWeeks(5).ofDays(3); // check the Week. Is it lost?
        System.out.println(threeDays);

        Period normalThreeDaysDuringWorktime = Period.ofDays(3);

        LocalDate tomorrow = LocalDate.now().plusDays(1).plusYears(1);
        System.out.println(tomorrow);

    }

    public static void demoLocalDate() {


        // vandaag, heden
        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate myBirthDate = LocalDate.of(1968, 8, 9);
//        LocalDate nonsense = new LocalDate(); // vout

        System.out.println(myBirthDate);

        LocalDate threeMonthPLus3Days = LocalDate.now().minusMonths(3).plusDays(3);
        System.out.println(threeMonthPLus3Days);

        Period period = Period.between(threeMonthPLus3Days, LocalDate.now());

        System.out.println(period);

        long years = Period.between(threeMonthPLus3Days, today).getYears();

        Period myPeriod = Period.between(myBirthDate, today);

        System.out.println(myPeriod);

        System.out.println(myPeriod.getYears());

        long daysOfRaymie = ChronoUnit.DAYS.between(myBirthDate, today);

        System.out.println(daysOfRaymie);

        long months = ChronoUnit.MONTHS.between(myBirthDate, today);
        System.out.println(months);


//        long seconds = ChronoUnit.SECONDS.between(myBirthDate, today); // runtime exception
//        System.out.println(seconds);


    }
}
