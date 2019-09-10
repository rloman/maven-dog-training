package nl.itacademy.dogtraining.datetime;

import org.junit.Assert;
import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DateTimeSelfTest {


    @Test
    public void testLocalDate() {

        LocalDate raysBirthDate = LocalDate.of(1968, 8, 9);

        Assert.assertEquals(9, raysBirthDate.getDayOfMonth());
        Assert.assertEquals(8, raysBirthDate.getMonthValue());

        // I am born on a Friday, pretty sure of that! :-)
        // and enums are OCP
        Assert.assertEquals(DayOfWeek.FRIDAY, raysBirthDate.getDayOfWeek());
    }

    @Test
    public void testLocalDateNow() {
        LocalDate now = LocalDate.now();

        System.out.println(now);
    }

    @Test
    public void testFormat(){

    }

    @Test
    public void testLocalDateTimeNow() {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
    }

    @Test
    public void testLocalDateAddition() {
        LocalDate first = LocalDate.of(2019, 9, 2);

        Assert.assertEquals(5, first.plusDays(3).getDayOfMonth());

        // leap year (Dutch: Schrikkeljaar)
        Assert.assertEquals(29, LocalDate.of(2016,2,28).plusDays(1).getDayOfMonth());

        // no leap year
        Assert.assertEquals(1, LocalDate.of(2017,2,28).plusDays(1).getDayOfMonth());
    }

    @Test
    public void testPeriod() {
        LocalDate now = LocalDate.now();
        LocalDate birthDayOfPieter = LocalDate.of(1984, 10, 16);

        Period p = Period.between(birthDayOfPieter, now);
        System.out.println(p);

        System.out.printf("Pieter loopt hier rond %d jaren, %d maanden en %d dagen%n",
                p.getYears(), p.getMonths(), p.getDays());

        System.out.println(p.getDays());


        // convert LocalDate to LocalDateTime
        LocalDateTime pieter = birthDayOfPieter.atStartOfDay();
        Assert.assertEquals(0, pieter.getHour());

        // to Epoch day (1 jan 1970)
        Assert.assertEquals(5402, birthDayOfPieter.toEpochDay());


        // to Epoch second, 1 jan 1970 on timezone GMT+2
        Assert.assertEquals(466725600, pieter.toEpochSecond(ZoneOffset.ofHours(2)));

    }

    @Test
    public void testMorePeriod() {
        Period day = Period.ofDays(1); // this is a Period of one day!
    }

    @Test
    public void testTrickyPeriod() {
        Period threeDays = Period.ofWeeks(5).ofDays(3); // check the Week. Is it lost?

        Assert.assertEquals(3, threeDays.getDays()); // and yes!
    }

    @Test
    public void testAddingPeriodOf3DaysToLocalTimeShouldFail() {
        try {
            LocalTime time = LocalTime.now();

            Period period = Period.ofDays(3);

            time.plus(period);

            Assert.fail();
        }
        catch(UnsupportedTemporalTypeException ustte) {
            // ok
            ustte.printStackTrace(); // but the test succeeds!!!
        }
    }

    @Test
    public void testDuration() {

        LocalDate birthDayOfPieter = LocalDate.of(1984, 10, 16);

        Duration oneHours = Duration.ofDays(1);
        System.out.println(oneHours.getSeconds() + " seconds");

        Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(oneHours2.getSeconds() + " seconds");

        System.out.println(birthDayOfPieter.toEpochDay());

        System.out.println(birthDayOfPieter);


    }

}
