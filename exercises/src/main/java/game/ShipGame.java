package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShipGame {

    private ShipPlace shipPlace = new ShipPlace();
    private List<Ship> shipList = new ArrayList<>();
    private Integer numbersOfMoves = 0;

    public void prepareGame() {
        Ship ship1 = new Ship("Ship_1");
        shipList.add(ship1);
        Ship ship2 = new Ship("Ship_2");
        shipList.add(ship2);
        Ship ship3 = new Ship("Ship_3");
        shipList.add(ship3);

        System.out.println("Welcome in my ShipGame!");
        System.out.println("You have to sink 3 ships. Give me for example 'a4' (you can choose a-g and 0-6).");
        System.out.println("Try to do that in as few moves as possible. Good luck!!");

        for (Ship ship : shipList) {
            List<String> place = shipPlace.placeShip(3);
            ship.setShipPositionFields(place);
        }
    }

    public void startGame() {
        while (!shipList.isEmpty()) {
            String playerMove = readMoveFromConsole();
            checkPlayerMove(playerMove);
        }
        stopGame();
    }

    public void checkPlayerMove(String move) {
        numbersOfMoves++;
        String result = "miss";

        for (Ship shipToCheck : shipList) {
            result = shipToCheck.check(move);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("sink!")) {
                System.out.println("You sank the ship: " + shipToCheck.getName() + "!");
                shipList.remove(shipToCheck);
                break;
            }
        }
        System.out.println(result);
    }

    public void stopGame() {
        System.out.println("All ships were sunk!");
        System.out.println("Number of your moves = " + numbersOfMoves);
    }

    private static String readMoveFromConsole () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me the field: ");
        return scanner.nextLine();
    }
}
