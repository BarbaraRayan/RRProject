package bandeau;

public class Flash extends Effect {

    public Flash(String message) {
        super(message);
    }

    @Override
    public void playOn(Bandeau bandeau) {
        bandeau.setMessage(message);
        bandeau.sleep(500);
        bandeau.setMessage("");
        bandeau.sleep(500);
        bandeau.setMessage(message);
        bandeau.sleep(500);
        bandeau.setMessage("");
        bandeau.sleep(500);
        bandeau.setMessage(message);
        bandeau.sleep(500);
        bandeau.setMessage(message);
        bandeau.sleep(500);
        bandeau.setMessage("");
        bandeau.sleep(500);
        bandeau.setMessage(message);
        bandeau.sleep(500);
        bandeau.setMessage("");
        bandeau.sleep(500);
        bandeau.setMessage(message);
        bandeau.sleep(500);
    }
}
