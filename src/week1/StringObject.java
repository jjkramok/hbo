package week1;

/**
 * Created by Kramok on 2/2/2016.
 */
public class StringObject {
    public static void main(String[] args) {
        String s1 = new String(args[0]);
        String s2 = new String(args[1]);
        System.out.println(s1 + " met een lengte van " + s1.length());
        System.out.println(s2 + " met een lengte van " + s2.length());
        if (s1.length() > s2.length()) {
            System.out.println(s1 + " is langer dan " + s2);
        } else if (s2.length() > s1.length()) {
            System.out.println(s2 + " is langer dan " + s1);
        } else {
            System.out.println("Beide Strings zijn even lang");
        }

    }
}
