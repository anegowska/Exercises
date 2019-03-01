package game;

public class StartGame {

    public static void main(String[] args) {
        ShipGame shipGame = new ShipGame();
        shipGame.prepareGame();
        shipGame.startGame();
    }
}
