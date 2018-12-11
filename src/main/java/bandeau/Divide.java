package bandeau;

import java.awt.Font;

public class Divide extends Effect {

    public Divide() {
        super();
    }
    public void playOn (Bandeau bandeau, String message) {
     
    for (int i = 0;i < message.length(); i++){
    System.out.println(message.charAt(i));
    bandeau.sleep(1000);
}
    bandeau.setMessage(message);
    
}
}
