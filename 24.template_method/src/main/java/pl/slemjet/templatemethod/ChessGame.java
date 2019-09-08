package pl.slemjet.templatemethod;

public class ChessGame extends Game {

    private int turn = 0;
    private int maxTurns = 10;

    public ChessGame(int numberOfPlayers) {
        super(numberOfPlayers);
    }

    @Override
    protected int getWinner() {
        return 0;
    }

    @Override
    protected void makeTurn() {
        System.out.println(String.format("Player %s takes turn %s", currentPlayer, turn++));
        currentPlayer = (currentPlayer + 1) % numberOfPlayers;
    }

    @Override
    protected void start() {
        System.out.println(String.format("Game %s starts", this.getClass().getSimpleName()));
    }

    @Override
    protected boolean haveTurns() {
        return turn < maxTurns;
    }
}
