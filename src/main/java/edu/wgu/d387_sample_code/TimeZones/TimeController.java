package edu.wgu.d387_sample_code.TimeZones;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TimeController {

    @GetMapping("/presentation")
    public ResponseEntity<String> announcePresentation() {
        String times = "There is a presentation starting at: " + TimeConvert.getTime();
        return new ResponseEntity<String> (times, HttpStatus.OK);
    }
}