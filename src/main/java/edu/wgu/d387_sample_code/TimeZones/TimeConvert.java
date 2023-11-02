package edu.wgu.d387_sample_code.TimeZones;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin
public class TimeConvert {

    public static String getTime(){

        //TODO:  Get Times and output formats for ET, MT, and UTC

        ZonedDateTime time = ZonedDateTime.now();

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("05:00"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String displayTimes = ET.format(DateTimeFormatter.ISO_LOCAL_TIME) + "ET / " + MT.format(DateTimeFormatter.ISO_LOCAL_TIME) + "MT / " + UTC.format(DateTimeFormatter.ISO_LOCAL_TIME) + "UTC";

        return displayTimes;
    }
}
