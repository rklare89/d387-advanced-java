package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translations.DisplayWelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);


		//TODO: Create threads for each welcome message. - DONE

		//English message
		DisplayWelcomeMessage displayWelcomeMessageEnglish = new DisplayWelcomeMessage(Locale.US);
		Thread englishMessage = new Thread(displayWelcomeMessageEnglish);
		englishMessage.start();

		//French message
		DisplayWelcomeMessage displayWelcomemessageFrench = new DisplayWelcomeMessage((Locale.CANADA_FRENCH));
		Thread frenchmessage = new Thread(displayWelcomemessageFrench);
		frenchmessage.start();




	}
}
