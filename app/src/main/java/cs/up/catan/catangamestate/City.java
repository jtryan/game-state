package cs.up.catan.catangamestate;

public class City extends Building {

    private int validWheat;
    private int validOre;
    private boolean checkValidWheat;
    private boolean checkValidOre;


    public City(int wheat, int ore, boolean checkWheat, boolean checkOre){
        this.validWheat = wheat;
        this.validOre = ore;
        this.checkValidWheat = checkWheat;
        this.checkValidOre = checkOre;

    }

    @Override
    public String toString() {
        return name + " requires " + validWheat + " Wheat and  "+ validOre + " Ore.\n";
    }
}
