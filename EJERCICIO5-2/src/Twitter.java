import java.time.LocalDate;

class Tweet {
    protected String message;
    protected LocalDate time;
    protected String sender;

    public Tweet(String message, String sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres.");
        }
        this.message = message;
        this.sender = sender;
        this.time = LocalDate.now(); // Se crea con la fecha actual
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getTime() {
        return time;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Tweet: " + message + " - Por: " + sender + " - En: " + time;
    }
}

class DirectMessage extends Tweet {
    private String receiver;

    public DirectMessage(String message, String sender, String receiver) {
        super(message, sender);
        if (receiver == null || receiver.isEmpty()) {
            throw new IllegalArgumentException("El receptor no puede estar vacío.");
        }
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "DirectMessage: " + message + " - De: " + sender + " - Para: " + receiver + " - En: " + time;
    }
}

class Retweet extends Tweet {
    private Tweet originalTweet;

    public Retweet(String message, String sender, Tweet originalTweet) {
        super(message, sender);
        this.originalTweet = originalTweet;
    }

    public Tweet getOriginalTweet() {
        return originalTweet;
    }

    @Override
    public String toString() {
        return "Retweet: " + message + " - Por: " + sender + " - En: " + time + " - Retweet de: " + originalTweet.getSender();
    }
}

public class Twitter {
    public static void main(String[] args) {
        Tweet tweet = new Tweet("altercado en Madrid centro", "manolo_34");
        System.out.println(tweet);

        DirectMessage dm = new DirectMessage("hola guapo", "maria.fdz", "gon.9");
        System.out.println(dm);

        Retweet retweet = new Retweet("¿que ha pasado en madrid?", "alvaroo_7", tweet);
        System.out.println(retweet);
    }
}
