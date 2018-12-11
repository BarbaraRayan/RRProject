package bandeau;

import java.util.HashSet;

public class Scenario {

    private Effect effects;
    private int repeats;
    private final Bandeau monBandeau = new Bandeau();
    HashSet<Effect> maListeEffects = new HashSet();

    public Scenario(Effect effects, int repeats) {
        this.effects = effects;
        this.repeats = repeats;
    }

    public void playOn() {
        for (int i = 1; i <= repeats; i++) {
            for (Effect e : maListeEffects) {
                effects.playOn(monBandeau, monBandeau.getMessage());
            }
        }
    }

    public void addEffect() {
        maListeEffects.add(effects);
    }
}
