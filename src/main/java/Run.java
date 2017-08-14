import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import utils.Messages;

import java.util.Locale;
import java.util.ResourceBundle;

import static utils.Messages.getMessagesForLocale;

public class Run {
    final static Logger log = Logger.getLogger(Run.class);

    public static void main(String[] args) {
        log.info(Messages.showMessage(getMessagesForLocale(new Locale("en", "US")), new DateTime().getHourOfDay()));
        log.info(Messages.showMessage(getMessagesForLocale(new Locale("ru", "RU")), new DateTime().getHourOfDay()));
    }
}
