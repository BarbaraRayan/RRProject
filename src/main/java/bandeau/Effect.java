package bandeau;

public abstract class Effect {

    protected final String message;

    public Effect(String message) {
        this.message = message;
    }

    public abstract void playOn(Bandeau bandeau);
}
