package game;

import java.util.ArrayList;
import java.util.List;

public class ShipPlace {

    private static final String alphabet = "abcdefg";
    private Integer boardsize = 49;
    private int[] board = new int[boardsize];
    private Integer numberOfShips = 0;

    public List<String> placeShip(Integer shipSize) {
        List<String> occupiedFields = new ArrayList<>();
        Integer[] coordinates = new Integer[shipSize];
        String help;
        boolean success = false;
        int place = 0;
        int attempts = 0;

        numberOfShips++;
        Integer increment = 1;
        Integer boardLength = 7;
        if (numberOfShips % 2 == 1) {
            increment = boardLength;
        }

        while (!success && (attempts++ < 200)) {
            place = (int) (Math.random() * boardsize);
            int x = 0;
            success = true;
            while (success && (x < shipSize)) {
                if (board[place] == 0) {
                    coordinates[x++] = place;
                    place += increment;
                    if (place >= boardsize) {
                        success = false;
                    }
                    if (x > 0 && (place % boardLength == 0)) {
                        success = false;
                    }
                }else {
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while (x < shipSize) {
            board[coordinates[x]] = 1;
            row = (int) (coordinates[x] / boardLength);
            column = coordinates[x] % boardLength;
            help = String.valueOf(alphabet.charAt(column));
            occupiedFields.add(help.concat(Integer.toString(row)));
            x++;
        }
        return occupiedFields;
    }
}
