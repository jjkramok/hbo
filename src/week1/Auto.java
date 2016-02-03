package week1;

/**
 * Created by Kramok on 3/2/2016.
 */
public class Auto {
    private String merk;
    private String type;
    private int pk;

    public Auto() {
        this.merk = "merk onbekend";
        this.type = "";
        this.pk = 20;
    }

    public Auto(String merk, String type, int pk) {
        this.merk = merk;
        this.type = type;
        this.pk = pk;
    }

    public static void main(String[] args) {

    }

    public String toString() {
        return this.getMerk() + " " + this.getType() +" (" + this.getPk() + " pk, maximaal op te voeren met " + (this.getPk() - 20) + ")";
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }
}
