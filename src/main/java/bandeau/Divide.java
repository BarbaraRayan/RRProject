package bandeau;

import java.awt.Font;

public class Divide extends Effect {

    // private final String message;
    public Divide(String message) {
        super(message);
        //this.message=message;
    }

    public void playOn(Bandeau bandeau, String message) {

        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
            bandeau.sleep(1000);
        }
        bandeau.setMessage(message);

    }

    @Override
    public void playOn(Bandeau bandeau) {
        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
            bandeau.sleep(1000);
        }
        bandeau.setMessage(message);
    }
}
