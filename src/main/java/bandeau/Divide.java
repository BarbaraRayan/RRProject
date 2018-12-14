package bandeau;

import java.awt.Font;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Divide extends Effect {

    //List<String> mlS = new LinkedList();
    // private final String message;
    public Divide(String message) {
        super(message);
        //this.message=message;
    }

    public void playOn(Bandeau bandeau, String message) {

        bandeau.setMessage(message);

        for (int i = 0; i < message.length(); i++) {
            //char m = message.charAt(i);
            //  bandeau.setMessage(m);
            //Arrays.toString((message.split("")));
           // bandeau.setMessage(Arrays.toString((message.split(""))));
            //System.out.println/*(Arrays.toString*/(message.charAt(i)/*message.split(""))*/);
            bandeau.sleep(1000);
        }
        // bandeau.setMessage(message);

    }

    @Override
    public void playOn(Bandeau bandeau) {
        
        bandeau.setMessage(message);

        for (int i = 0; i<message.length(); i++) {
            System.out.println(message.charAt(i));
          // String m = Arrays.toString((message.split("")));
           //for (int j= 0; j<m.length();i++)
           //{
               //String[] parts = m.split("\\,");
              // bandeau.setMessage(parts);
           //}

            bandeau.sleep(1000);
        }
        // bandeau.setMessage(message);
    }
}
