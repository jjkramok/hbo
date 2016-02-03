package week1;
import java.lang.Math;
import java.util.Scanner;

/**
 * Created by Kramok on 2/2/2016.
 */
public class Opgave3 {
    public static void main(String[] args) {
        /*
        String naam;
        System.out.println("Student naam: ");
        Scanner in = new Scanner(System.in);
        naam = in.nextLine();
        System.out.println("Je naam is " + naam);
        */

        //Rectangle a, b, c
        //rectangle(8, 8);

        //Triangle d, e
        //triangle(8);
        //triangle(20);

        //Reverse Triangle f, g
        //reverseTriangle(8);

        //Side Triangle h
        sideTriangle(5);
        }

    //Maakt een driehoek met oplopende aantal sterretjes
    public static void triangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    //Maakt een driehoek met aflopende aantal sterretjes
    public static void reverseTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    //unfinished
    public static void sideTriangle(int width) {
        int row = 1;
        while (row < width) {
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println("");
            row++;
        }
        if (row == width) {
            //We are now in the middle row, print width amount of stars
            for (int i = 0; i < width; i++) {
                System.out.print("*");
            }
            System.out.println("");
            row++;
        }
        int fromMid = 1;
        while (row > width && fromMid < width) {
            for (int i = 0; i < width - fromMid; i++) {
                System.out.print("*");
            }
            System.out.println("");
            fromMid++;
        }
    }

    // Maakt een rechthoek, columns is het aantal sterretjes per regel
    public static void rectangle(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print("*");
            }
            //Volgende regel
            System.out.println("");
        }
        //Sla een regel over
        System.out.println("");
    }
}

