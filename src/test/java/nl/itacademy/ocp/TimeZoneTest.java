package nl.itacademy.ocp;

import org.junit.Assert;
import org.junit.Test;

import java.time.*;

public class TimeZoneTest {

    @Test
    public void printAllTimeZones() {
        ZoneId.getAvailableZoneIds().stream()
                .filter(n -> n.toLowerCase().contains("Asia"))
                .forEach(System.out::println);
    }

    @Test
    public void testInstant() {

        // convert 23-03-2003T21:35 NL time to US time

        LocalDateTime lieke = LocalDateTime.of(2003, 3, 23, 21, 35);

        Instant gmt = lieke.toInstant(ZoneOffset.ofHours(1));

        ZonedDateTime usTime = gmt.atZone(ZoneId.of("US/Eastern"));

        // it should be 15:35

        System.out.println(usTime);
        Assert.assertEquals(15, usTime.getHour());

        // How late was that in China?
        ZonedDateTime chinaTime = gmt.atZone(ZoneId.of("Asia/Shanghai"));
        Assert.assertEquals(4, chinaTime.getHour());
        Assert.assertEquals(24, chinaTime.getDayOfMonth());

        System.out.println(chinaTime);

        // How late was that in Japan?
        ZonedDateTime nippon = gmt.atZone(ZoneId.of("Asia/Tokyo"));
        Assert.assertEquals(5, nippon.getHour());
        Assert.assertEquals(24, nippon.getDayOfMonth());





    }
}
