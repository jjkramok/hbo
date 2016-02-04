package week1.Mijnenveger;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kramok on 3/2/2016.
 */
public class Mijnenveger {

    public static final int SIZE = 9;

    public static final int BOMB = 9;

    private ArrayList<ArrayList<Integer>> mijnenveld = new ArrayList<ArrayList<Integer>>();

    public Mijnenveger(int aantalMijnen, int rows, int columns) {
        //First create a board with dimensions of rows by columns
        for (int i = 0; i < rows; i++) {
            //Fill the rows with columns
            mijnenveld.add(new ArrayList<Integer>());
        }
        //Lets loop over all columns, and add the number of fields specified.
        for (ArrayList<Integer> column : mijnenveld) {
            //Fill the columns with zero's
            for (int i = 0; i < columns; i++) {
                column.add(0);
            }
        }

        //Now that the board is created, lets fill it with the desired amount of bombs.
        Random rnd = new Random();
        int row;
        int column;
        //As long as there are mines to distribute, continue placing them
        while (aantalMijnen != 0) {
            //Generate a random position in the grid for a bomb.
            row = rnd.nextInt(mijnenveld.size());
            column = rnd.nextInt(mijnenveld.get(0).size());
            //Is there already a bomb here?
            if (mijnenveld.get(row).get(column) != BOMB) {
                //No? place a bomb, and lessen the amount of bombs left to distribute
                mijnenveld.get(row).set(column, BOMB);
                aantalMijnen--;
            }
        }

        //To finish up the board needs to adapt to the bombs placed
        genereerVeld();

    }

    public void genereerVeld() {
        //Generates the rest of the board based on the 9's
        for (int i = 0; i < SIZE; i++) {
            //Now we are looping over all rows
            for (int j = 0; j < SIZE; j++) {
                //Now we are looping over all fields in this row
            }
        }
    }

    public static void main(String[] args) {
        Mijnenveger mn = new Mijnenveger(3, 5 ,3);
        System.out.println(mn.toString());
        System.out.println("test");
        System.out.println(mn.getMijnenveld().toString());
    }

    public ArrayList<ArrayList<Integer>> getMijnenveld() {
        return mijnenveld;
    }

    public void setMijnenveld(ArrayList<ArrayList<Integer>> mijnenveld) {
        this.mijnenveld = mijnenveld;
    }

    public String toString() {
        String board = "";
        for (ArrayList<Integer> row : mijnenveld) {
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
