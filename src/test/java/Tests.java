import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Олег on 8/13/2017.
 */
public class Tests{

    ResourceBundle russianMessages = Run.getMessagesForLocale(new Locale("ru", "RU"));
    ResourceBundle englishMessages = Run.getMessagesForLocale(new Locale("en", "US"));

    @Test
    public void testTimeOfTheDayDefinition(){
        assertEquals("morning", Run.getTimeOfDay(6));
        assertEquals("day", Run.getTimeOfDay(14));
        assertEquals("evening", Run.getTimeOfDay(19));
        assertEquals("night", Run.getTimeOfDay(23));
    }

    @Test
    public void testRussianTranslation(){
        assertEquals("Доброе утро, мир!", russianMessages.getString("morning"));
        assertEquals("Добрый день, мир!", russianMessages.getString("day"));
        assertEquals("Добрый вечер, мир!", russianMessages.getString("evening"));
        assertEquals("Доброй ночи, мир!", russianMessages.getString("night"));
    }

    @Test
    public void testEnglishTranslation(){
        assertEquals("Good morning, World!", englishMessages.getString("morning"));
        assertEquals("Good day, World!", englishMessages.getString("day"));
        assertEquals("Good evening, World!", englishMessages.getString("evening"));
        assertEquals("Good night, World!", englishMessages.getString("night"));
    }

    @Test
    public void testAllRussian()
    {
        assertEquals("Доброе утро, мир!", Run.showMessage(russianMessages, 6));
        assertEquals("Добрый день, мир!", Run.showMessage(russianMessages, 12));
        assertEquals("Добрый вечер, мир!", Run.showMessage(russianMessages, 20));
        assertEquals("Доброй ночи, мир!", Run.showMessage(russianMessages, 3));
    }

    @Test
    public void testAllEnglish()
    {
        assertEquals("Good morning, World!", Run.showMessage(englishMessages, 6));
        assertEquals("Good day, World!", Run.showMessage(englishMessages, 12));
        assertEquals("Good evening, World!", Run.showMessage(englishMessages, 20));
        assertEquals("Good night, World!", Run.showMessage(englishMessages, 3));
    }
}
