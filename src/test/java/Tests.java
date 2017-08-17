import static org.junit.Assert.*;

import org.junit.Test;
import utils.MessagesLocalizationAndDisplaying;
import utils.TimeOfDayDetermination;

import java.util.Locale;
import java.util.ResourceBundle;

public class Tests {

    ResourceBundle russianMessages = MessagesLocalizationAndDisplaying.getMessagesForLocale(new Locale("ru", "RU"));
    ResourceBundle englishMessages = MessagesLocalizationAndDisplaying.getMessagesForLocale(new Locale("en", "US"));

    @Test
    public void testMorningDefinition() {
        for (int i = 6; i < 9; i++) {
            assertEquals("morning", TimeOfDayDetermination.getTimeOfDay(i));
        }
    }

    @Test
    public void testDayDefinition() {
        for (int i = 9; i < 19; i++) {
            assertEquals("day", TimeOfDayDetermination.getTimeOfDay(i));
        }
    }

    @Test
    public void testEveningDefinition() {
        for (int i = 19; i < 23; i++) {
            assertEquals("evening", TimeOfDayDetermination.getTimeOfDay(i));
        }
    }

    @Test
    public void testNightDefinition() {
        assertEquals("night", TimeOfDayDetermination.getTimeOfDay(23));
        for (int i = 0; i < 6; i++) {
            assertEquals("night", TimeOfDayDetermination.getTimeOfDay(i));
        }
    }

    @Test
    public void testRussianTranslation() {
        assertEquals("Доброе утро, мир!", russianMessages.getString("morning"));
        assertEquals("Добрый день, мир!", russianMessages.getString("day"));
        assertEquals("Добрый вечер, мир!", russianMessages.getString("evening"));
        assertEquals("Доброй ночи, мир!", russianMessages.getString("night"));
    }

    @Test
    public void testEnglishTranslation() {
        assertEquals("Good morning, World!", englishMessages.getString("morning"));
        assertEquals("Good day, World!", englishMessages.getString("day"));
        assertEquals("Good evening, World!", englishMessages.getString("evening"));
        assertEquals("Good night, World!", englishMessages.getString("night"));
    }

    @Test
    public void testDefaultMessages() {
        Locale.setDefault(new Locale("fr", "FR"));
        ResourceBundle defaultMessages = MessagesLocalizationAndDisplaying.getMessagesForLocale(Locale.getDefault());
        assertEquals("Good morning, World!", defaultMessages.getString("morning"));
        assertEquals("Good day, World!", defaultMessages.getString("day"));
        assertEquals("Good evening, World!", defaultMessages.getString("evening"));
        assertEquals("Good night, World!", defaultMessages.getString("night"));
    }
}
