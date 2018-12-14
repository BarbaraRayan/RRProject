package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.HashSet;

public class ExempleScenario {

    private final Scenario monScenario = new Scenario(1);

    public static void main(String[] args) {
        new ExempleScenario().Test();
    }

    public void Test() {

        Effect e1 = new Flash("Flash");
        Effect e2 = new Divide("DIVISER");
        Effect e3 = new Rainbow("On change de couleur");
        Effect e4 = new ClockAndAnticlock("Clock And Anticlock");

        monScenario.addEffect(e1);
        monScenario.addEffect(e2);
        monScenario.addEffect(e3);
        monScenario.addEffect(e4);

        monScenario.playOn();

    }

}
