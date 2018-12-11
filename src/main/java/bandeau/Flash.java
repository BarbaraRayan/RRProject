package bandeau;

public class Flash extends Effect {

    public Flash() {
        super();
    }

    public void playOn(Bandeau bandeau, String message) {
        bandeau.setMessage(message);
        bandeau.sleep(1000);
        bandeau.setMessage("");
        bandeau.sleep(1000);
        bandeau.setMessage(message);
        bandeau.sleep(1000);
        bandeau.setMessage("");
        bandeau.sleep(1000);
        bandeau.setMessage(message);
        bandeau.sleep(1000);
    }
}
