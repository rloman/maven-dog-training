package nl.itacademy.ocp.timezones;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {

        {


            ZonedDateTime now = ZonedDateTime.now();

            System.out.println(now);

            Instant gmtRelatedToMyTimezone = now.toInstant();

            System.out.println(gmtRelatedToMyTimezone);

            ZoneId zoneUs = ZoneId.of("US/Eastern");

            ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2005, 9, 6, 8, 40, 0), zoneUs);

            System.out.println(zonedDateTime);


            LocalDateTime dateTime = zonedDateTime.toLocalDateTime();

            System.out.println(dateTime);

            Instant gmt = zonedDateTime.toInstant();

            System.out.println(gmt);

            OffsetDateTime offzetDateTime = zonedDateTime.toOffsetDateTime();

            System.out.println(offzetDateTime);

            // print all time zone

            ZoneId.getAvailableZoneIds().stream().filter(zone -> zone.toLowerCase().contains("amster")).forEach(
                    System.out::println
            );


        }
        // hoe lang wandelt Pieter hier al rond in dagen

        {
            LocalDate now = LocalDate.now();
            LocalDate birthDayOfPieter = LocalDate.of(1984, 10, 16);

            long aantalDagenPieterOpAardkloot = ChronoUnit.DAYS.between(birthDayOfPieter, now);



            System.out.println(aantalDagenPieterOpAardkloot);

            Period p = Period.between(birthDayOfPieter, now);
            System.out.println(p);

            System.out.printf("Pieter loopt hier rond %d jaren, %d maanden en %d dagen%n",
                    p.getYears(), p.getMonths(), p.getDays());

            System.out.println(p.getDays());

            Duration oneHours = Duration.ofDays(aantalDagenPieterOpAardkloot);
            System.out.println(oneHours.getSeconds() + " seconds");

            Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
            System.out.println(oneHours2.getSeconds() + " seconds");

            System.out.println(birthDayOfPieter.toEpochDay());

            System.out.println(birthDayOfPieter);

            LocalDateTime pieter = birthDayOfPieter.atStartOfDay();

            System.out.println(pieter.toEpochSecond(ZoneOffset.ofHours(2)));


            // 5 april 1989 om 02:10

            LocalDateTime annemiekBirthDateTime = LocalDateTime.of(1989, 4, 5, 2,10);

            LocalDateTime nowDateTime = LocalDateTime.now();

            long aantalDagenAnnemiekOpAarde = ChronoUnit.DAYS.between(annemiekBirthDateTime, nowDateTime);

            System.out.printf("Annemiek loopt rond %d dagen op aarde%n", aantalDagenAnnemiekOpAarde);


            System.out.println("Een miljard seconden is hoeveel jaar?:"+1_000_000_000/(365.25*24*3600));

        }



    }
}
