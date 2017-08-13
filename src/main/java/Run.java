import org.joda.time.DateTime;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Олег on 13.08.2017.
 */
public class Run {
    public static void main(String[] args) {

        showMessage(getTextForMessage(new Locale("en","US")));
        showMessage(getTextForMessage(new Locale("ru","RU")));

    }

    public static String getTextForMessage(Locale locale){
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        return messages.getString(getTimeOfDay());
    }

    public static void showMessage(String text){

        System.out.println(text);
    }

    public static String getTimeOfDay(){
        int hour = new DateTime().getHourOfDay();
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
