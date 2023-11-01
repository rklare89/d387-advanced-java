package edu.wgu.d387_sample_code.translations;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayWelcomeMessage implements Runnable{

    Locale locale;

    //Constructor for class
    public DisplayWelcomeMessage(Locale locale) {
        this.locale = locale;
    }


    //Get Specific Message, ResourceBundle.getbundle(basename, locale)
    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");
    }


    @Override
    public void run() {

    }
}
