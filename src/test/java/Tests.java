import static org.junit.Assert.*;

import org.junit.Test;
import utils.Messages;
import utils.TimeOfDay;

import java.util.Locale;
import java.util.ResourceBundle;

public class Tests {

    ResourceBundle russianMessages = Messages.getMessagesForLocale(new Locale("ru", "RU"));
    ResourceBundle englishMessages = Messages.getMessagesForLocale(new Locale("en", "US"));

    @Test
    public void testMorningDefinition() {

        for (int i = 6; i < 9; i++) {
            assertEquals("morning", TimeOfDay.getTimeOfDay(i));
        }
    }

    @Test
    public void testDayDefinition() {
        for (int i = 9; i < 19; i++) {
            assertEquals("day", TimeOfDay.getTimeOfDay(i));
        }
    }

    @Test
    public void testEveningDefinition() {
        for (int i = 19; i < 23; i++) {
            assertEquals("evening", TimeOfDay.getTimeOfDay(i));
        }
    }

    @Test
    public void testNightDefinition() {
        assertEquals("night", TimeOfDay.getTimeOfDay(23));
        for (int i = 0; i < 6; i++) {
            assertEquals("night", TimeOfDay.getTimeOfDay(i));
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
    public void testAllRussian() {
        assertEquals("Доброе утро, мир!", Messages.showMessage(russianMessages, 6));
        assertEquals("Добрый день, мир!", Messages.showMessage(russianMessages, 12));
        assertEquals("Добрый вечер, мир!", Messages.showMessage(russianMessages, 20));
        assertEquals("Доброй ночи, мир!", Messages.showMessage(russianMessages, 3));
    }

    @Test
    public void testAllEnglish() {
        assertEquals("Good morning, World!", Messages.showMessage(englishMessages, 6));
        assertEquals("Good day, World!", Messages.showMessage(englishMessages, 12));
        assertEquals("Good evening, World!", Messages.showMessage(englishMessages, 20));
        assertEquals("Good night, World!", Messages.showMessage(englishMessages, 3));
    }
}
