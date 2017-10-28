package chapter13.example1.resource.bundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author dalgarins
 */
public class LocalizedBoxOfficeHits {

    public void printMovieDetails(ResourceBundle resource) {
        String movie  = resource.getString("MovieName");
        Long revenue = (Long)(resource.getObject("GrossRevenue"));
        Integer year = (Integer)(resource.getObject("Year"));
        
        System.out.println("Movie " + movie + "(" + year + ")" + " grossed " + revenue);
    }
    
    
    public static void main(String[] args) {

        LocalizedBoxOfficeHits localizedHits = new LocalizedBoxOfficeHits();
        Locale locale = Locale.getDefault();
        localizedHits.printMovieDetails(ResourceBundle.getBundle("chapter13.example1.resource.bundles.ResBundle", locale));
        
        locale = new Locale("it", "IT", "");
        localizedHits.printMovieDetails(ResourceBundle.getBundle("chapter13.example1.resource.bundles.ResBundle", locale));
    }
    
}
