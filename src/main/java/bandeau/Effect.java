package bandeau;

public abstract class Effect {
    
    protected final String message;
    
    public Effect(String message){
        this.message=message;
    }

    public void playOn(Bandeau bandeau, String message) {
    }
}
