import java.util.ArrayList;

public class UserAccount {
    private String alias;
    private String email;
    private ArrayList<Tweet> tweets;
    private ArrayList<UserAccount> followers;
    private ArrayList<UserAccount> following;

    public UserAccount() {
        this.alias = "";
        this.email = "";
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public UserAccount(String alias, String email) {
        if (Utils.isValidAlias(alias)) {
            this.alias = alias;
        } else {
            this.alias = "defaultAlias";
            System.out.println("El alias ingresado no es válido. Se ha asignado un alias por defecto.");
        }

        if (Utils.isValidEmail(email)) {
            this.email = email;
        } else {
            this.email = "default@example.com";
            System.out.println("El email ingresado no es válido. Se ha asignado un email por defecto.");
        }

        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public void follow(UserAccount user) {
        if (!following.contains(user)) {
            following.add(user);
            user.addFollower(this);
        } else {
            System.out.println("Ya estás siguiendo a este usuario.");
        }
    }

    private void addFollower(UserAccount follower) {
        followers.add(follower);
    }

    public void tweet(Tweet tweet) {
        tweets.add(tweet);
        for (UserAccount follower : followers) {
            follower.addToTimeline(tweet);
        }
    }

    private void addToTimeline(Tweet tweet) {
        tweets.add(tweet);
    }

    @Override
    public String toString() {
        return "ALBERTO" + alias + "agonzolm@myuax.com" + email;
    }
}


