package bandeau;

import java.awt.Font;

public class ClockAndAnticlock extends Effect {

    public ClockAndAnticlock(String message) {
        super(message);
    }

    public void playOn(Bandeau bandeau, String message) {
        bandeau.setMessage(message);
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation((2 * Math.PI * i) / 100);
            bandeau.sleep(100);
            bandeau.setFont(new Font(message, Font.BOLD, 10 + i));
        }
        for (int i = 100; i >= 1; i--) {
            bandeau.setRotation((2 * Math.PI * i) / 100);
            bandeau.sleep(100);
            bandeau.setFont(new Font(message, Font.BOLD, i));
        }
    }
}
