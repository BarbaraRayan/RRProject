package bandeau;

public class Flash extends Effect {

    public Flash(String message) {
        super(message);
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

    @Override
    public void playOn(Bandeau bandeau) {
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
