package bandeau;

import java.awt.Color;

public class Rainbow extends Effect{
public Rainbow(){
    super();
} 
@Override
public void playOn(Bandeau bandeau, String message){
    bandeau.setMessage(message);
    bandeau.setForeground(Color.RED);
    bandeau.sleep(1000);
    bandeau.setForeground(Color.ORANGE);
    bandeau.sleep(1000);
    bandeau.setForeground(Color.YELLOW);
    bandeau.sleep(1000);
}
}
