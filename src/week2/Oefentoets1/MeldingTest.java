package week2.Oefentoets1;

import java.time.DayOfWeek;

/**
 * Created by Kramok on 9/2/2016.
 */
public class MeldingTest {
    public static void main(String[] args) {
        Melding mld = new Melding("De kroketten zijn op!");
        System.out.println(mld);
        mld.setAangepasteDag(DayOfWeek.FRIDAY);
        System.out.println(mld);
    }

}
