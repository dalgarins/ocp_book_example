package chapter13.example1.localization;

import java.util.Locale;

/**
 *
 * @author dalgarins
 */
public class LocaleDetails {

    public static void main(String[] args) {

        Locale.setDefault(Locale.CANADA_FRENCH);
        Locale defaultLocale = Locale.getDefault();
        System.out.printf("The default locale is %s %n", defaultLocale);
        System.out.printf("The default language code is %s and the name is %s %n", defaultLocale.getLanguage(), defaultLocale.getDisplayLanguage());
        
        System.out.printf("The country code is %s and the name is %s %n", defaultLocale.getCountry(), defaultLocale.getDisplayCountry());
        System.out.printf("The variant code is %s and the name is %s %n", defaultLocale.getVariant(), defaultLocale.getDisplayVariant());
        
        System.out.println(Locale.GERMANY.getDisplayCountry(Locale.ENGLISH));
        
        
        Locale locale1 = new Locale("it", "", "");
        Locale locale2 = Locale.forLanguageTag("it");
        Locale locale3 = new Locale.Builder().setLanguageTag("it").build();
        Locale locale4 = Locale.ITALIAN;
    }
    
}
