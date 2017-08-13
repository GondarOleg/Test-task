import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Олег on 13.08.2017.
 */
public class Run {
    final static Logger logger = Logger.getLogger(Run.class);
    public static void main(String[] args) {

        showMessage(getMessagesForLocale(new Locale("en","US")), new DateTime().getHourOfDay());
        showMessage(getMessagesForLocale(new Locale("ru","RU")), new DateTime().getHourOfDay());

    }

    public static ResourceBundle getMessagesForLocale(Locale locale){
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        return messages;
    }

    public static String showMessage(ResourceBundle messages, int hour){
        String message = messages.getString(getTimeOfDay(hour));
        System.out.println(message);
        return message;
    }

    public static String getTimeOfDay(int hour){
        if(hour >= 6 && hour < 9){
            return "morning";
        }else if(hour >= 9 && hour < 19){
            return "day";
        }else if(hour >= 19 && hour < 23){
            return "evening";
        }else {
            return "night";
        }
    }
}
