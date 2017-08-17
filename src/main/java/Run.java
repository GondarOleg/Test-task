import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import utils.MessagesLocalizationAndDisplaying;

import java.util.Locale;

import static utils.MessagesLocalizationAndDisplaying.getMessagesForLocale;

public class Run {
    final static Logger log = Logger.getLogger(Run.class);

    public static void main(String[] args) {
        log.info(MessagesLocalizationAndDisplaying.showMessage(getMessagesForLocale(Locale.getDefault()), new DateTime().getHourOfDay()));
    }
}
