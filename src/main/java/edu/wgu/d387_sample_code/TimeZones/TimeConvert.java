package edu.wgu.d387_sample_code.TimeZones;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeConvert {

    public static String getTime(){

        //TODO:  Get Times and output formats for ET, MT, and UTC

        ZonedDateTime time = ZonedDateTime.now();



        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        //Makes custom format for Time
        String timePattern = "hh:mm a";
        DateTimeFormatter timePatternFormatter = DateTimeFormatter.ofPattern(timePattern);

        String displayTimes = ET.format(timePatternFormatter) + " ET / " + MT.format(timePatternFormatter) + " MT / " + UTC.format(timePatternFormatter) + " UTC";

        return displayTimes;
    }
}
