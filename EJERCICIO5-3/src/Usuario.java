public class Usuario {
    private String nombre;
    private String email;

    public void publicarTweet(String tweet) throws ExcepcionTweetDemasiadoLargo {
        if (tweet.length() > 140) {
            throw new ExcepcionTweetDemasiadoLargo("El tweet supera los 140 caracteres");
        }

    }
}

class ExcepcionTweetDemasiadoLargo extends Exception {
    public ExcepcionTweetDemasiadoLargo(String mensaje) {
        super(mensaje);
    }
}
