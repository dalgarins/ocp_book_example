package chapter13.example1.resource.bundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author dalgarins
 */
public class LocalizedHello {

    public static void main(String[] args) {
        
        Locale currentLocale = Locale.getDefault();
        ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
        
        System.out.println(resBundle.getString("Greeting"));
        
        
    }
    
}
