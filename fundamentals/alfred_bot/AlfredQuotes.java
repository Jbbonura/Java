import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("H");
        String newDate = formatter.format(date);
        int hour = Integer.parseInt(newDate);
        if (hour  < 12) {
            return "Good Morning. Lovely to see you.";
        }
        else if (hour < 17){
            return "Good Afternoon. Lovely to see you.";
        }
        else {
            return "Good Evening! Lovely to see you.";
        }
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s", date);
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }

    
}