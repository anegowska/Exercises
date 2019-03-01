package game;

import java.util.List;

public class Ship {

    private List<String> shipPositionFields;
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShipPositionFields(List<String> shipPositionFields) {
        this.shipPositionFields = shipPositionFields;
    }

    public String check(String move) {
        String result = "miss";
        int index = shipPositionFields.indexOf(move);

        if (index >= 0) {
            shipPositionFields.remove(index);
            if (shipPositionFields.isEmpty()) {
                result = "sink!";
            }else {
                result = "hit";
            }
        }
        return result;
    }
}
