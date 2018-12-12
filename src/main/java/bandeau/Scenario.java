package bandeau;

import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;

public class Scenario {

   // private Effect effects;
    private int repeats;
    private final Bandeau monBandeau = new Bandeau();
    List<Effect> maListeEffects = new LinkedList();

    public Scenario( int repeats) {
      //  this.effects = effects;
        this.repeats = repeats;
    }

    public void playOn() {
        for (int i = 1; i <= repeats; i++) {
            for (Effect e : maListeEffects) {
                e.playOn(monBandeau/*,monBandeau.getMessage()*/);
            }
        }
    }

    public void addEffect(Effect e ) {
        maListeEffects.add(e);
    }
}
