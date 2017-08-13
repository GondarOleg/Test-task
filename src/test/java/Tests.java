import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * Created by Олег on 8/13/2017.
 */
public class Tests{

    @Test
    public void testTimeOfTheDay(){
        assertEquals("day", Run.getTimeOfDay());
    }
}
