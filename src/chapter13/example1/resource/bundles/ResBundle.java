package chapter13.example1.resource.bundles;

import java.util.ListResourceBundle;

/**
 *
 * @author dalgarins
 */
public class ResBundle extends ListResourceBundle{

    static final Object[][] contents = {
        {"MovieName", "Avatar"},
        {"GrossRevenue", (Long) 4567894L},
        {"Year", (Integer) 2009}
    };
    
    @Override
    protected Object[][] getContents() {
        return contents;
    }    
}
