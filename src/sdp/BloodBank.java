package sdp;

public class BloodBank {

    public BloodBank(String typeOfBlood, String unitsOfBlood) {
        this.typeOfBlood = typeOfBlood;
        this.unitsOfBlood = unitsOfBlood;
    }

    public String getTypeOfBlood() {
        return typeOfBlood;
    }

    public void setTypeOfBlood(String typeOfBlood) {
        this.typeOfBlood = typeOfBlood;
    }

    public String getUnitsOfBlood() {
        return unitsOfBlood;
    }

    public void setUnitsOfBlood(String unitsOfBlood) {
        this.unitsOfBlood = unitsOfBlood;
    }
    private String typeOfBlood, unitsOfBlood;
}
