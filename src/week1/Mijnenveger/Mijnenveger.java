package week1.Mijnenveger;

import java.util.Random;

/**
 * Created by Kramok on 3/2/2016.
 */
public class Mijnenveger {

    public static final int SIZE = 9;

    private int[][] mijnenveld = new int[SIZE][SIZE];

    public Mijnenveger(int aantalMijnen) {
        Random rnd = new Random();
        int row;
        int column;
        row = rnd.nextInt(10);
        column = rnd.nextInt(10);

        for (int i = 0; i < SIZE; i++) {
            //Now we are looping over all rows
            for (int j = 0; j < SIZE; j++) {
                //Now we are looping over all fields in this row
                //TODO lets fill the board with 0's for now
                mijnenveld[i][j] = 0;
            }
        }

        //genereerVeld();
    }

    public void genereerVeld() {
        //generates the rest of the fields based on the 9's
    }

    public static void main(String[] args) {
        Mijnenveger mn = new Mijnenveger(0);
        System.out.println(mn.toString());
    }

    public int[][] getMijnenveld() {
        return mijnenveld;
    }

    public void setMijnenveld(int[][] mijnenveld) {
        this.mijnenveld = mijnenveld;
    }

    public String toString() {
        String board = "";
        for (int[] row : mijnenveld) {
            //Now we are looping over all rows
            for (int field : row) {
                //Now we are looping over all fields in this row
                board +=  field +  " | ";
            }
            board += "\n";
            for (int i = 0; i < SIZE + 3; i++) {
                board += " - ";
            }
            board += "\n";
        }
        return board;
    }
}
