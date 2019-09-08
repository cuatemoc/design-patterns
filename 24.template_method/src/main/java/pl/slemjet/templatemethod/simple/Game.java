package pl.slemjet.templatemethod.simple;

public abstract class Game {
    protected int numberOfPlayers;
    protected int currentPlayer;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void run() {
        start();
        while (haveTurns()) {
            makeTurn();
        }
        System.out.println(String.format("Player %s has won", getWinner()));
    }

    protected abstract int getWinner();

    protected abstract void makeTurn();

    protected abstract void start();

    protected abstract boolean haveTurns();
}
