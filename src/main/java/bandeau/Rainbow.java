package bandeau;

import java.awt.Color;

public class Rainbow extends Effect {

    public Rainbow(String message) {
        super(message);
    }

    @Override
    public void playOn(Bandeau bandeau) {
        bandeau.setMessage(message);
        bandeau.setForeground(Color.RED);
        bandeau.sleep(1000);
        bandeau.setForeground(Color.ORANGE);
        bandeau.sleep(1000);
        bandeau.setForeground(Color.YELLOW);
        bandeau.sleep(1000);
        bandeau.setForeground(Color.GREEN);
        bandeau.sleep(1000);
        bandeau.setForeground(Color.CYAN);
        bandeau.sleep(1000);
        bandeau.setForeground(Color.BLUE);
        bandeau.sleep(1000);
        bandeau.setForeground(Color.MAGENTA);
        bandeau.sleep(1000);
    }
}
