package edu.wgu.d387_sample_code.translations;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.Locale;

@CrossOrigin
@RestController
public class DisplayWelcomeMessageController {


    @GetMapping("/welcome")
    public ResponseEntity<String> showWelcome (@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        DisplayWelcomeMessage message = new DisplayWelcomeMessage(locale);

        return new ResponseEntity<String> (message.getWelcomeMessage(), HttpStatus.OK);
    }


}
