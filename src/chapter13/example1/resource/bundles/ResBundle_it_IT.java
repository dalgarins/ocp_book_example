package chapter13.example1.resource.bundles;

import java.util.ListResourceBundle;

/**
 *
 * @author dalgarins
 */
public class ResBundle_it_IT extends ListResourceBundle{

    static final Object[][] contents = {
        {"MovieName", "Che Bella Giornata"},
        {"GrossRevenue", (Long) 40000L},
        {"Year", (Integer) 2011}
    };
    
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
