package model;

public class Cat {
    private String meh;
    private int ves;

    public Cat(String meh, int ves) {
        this.meh = meh;
        this.ves = ves;
    }

    public Cat() {
    }

    public String getMeh() {
        return meh;
    }

    public void setMeh(String meh) {
        this.meh = meh;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }
}
