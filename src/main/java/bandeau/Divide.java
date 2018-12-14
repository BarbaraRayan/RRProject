package bandeau;

import java.awt.Font;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Divide extends Effect {

    public Divide(String message) {
        super(message);
    }

    @Override
    public void playOn(Bandeau bandeau) {

        bandeau.setMessage(message);

        for (int i = 0; i < message.length(); i++) {
            bandeau.setMessage(Character.toString(message.charAt(i)));
            bandeau.sleep(1000);
        }
        bandeau.setMessage(message);
    }
}
