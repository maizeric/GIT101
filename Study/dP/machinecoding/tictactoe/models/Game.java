package designpatterns.machinecoding.tictactoe.models;

import designpatterns.machinecoding.tictactoe.exceptions.InvalidGameDimensionException;
import designpatterns.machinecoding.tictactoe.exceptions.InvalidNumberOfPlayersException;
import designpatterns.machinecoding.tictactoe.strategies.gamewinningstrategy.GameWinningStrategy;
import designpatterns.machinecoding.tictactoe.strategies.gamewinningstrategy.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;

    private List<Move> moves;
    private int nextPlayerIndex;
    private GameStatus gameStatus;

    private Player winner;

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    private GameWinningStrategy gameWinningStrategy;

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void displayBoard(){
        this.board.displayBoard();
    }

    public void makeNextMove(){
        //Steps
        //1.Player should be able to decide the move
        //2.Check the validation of the move, if move is valid then make the move

        Player playerToMove = players.get(nextPlayerIndex);
        System.out.println("It is "+playerToMove.getName()+" 's turn");
        Move move = playerToMove.decideMove(board);

        //Validate the move.

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)){
            //Move is Valid.
            board.applyMove(move);
            moves.add(move);

            //Check the winner -> Here the game winning strategy is required
            if(gameWinningStrategy.checkWinner(board,move)){
                gameStatus = GameStatus.ENDED;
                winner = playerToMove;
            }

            nextPlayerIndex +=1;
            nextPlayerIndex%=players.size();

        } else{
            //throw some exception.
        }


    }




    public static class Builder{

        private int dimension;
        private List<Player> players;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean isValid() throws InvalidNumberOfPlayersException, InvalidGameDimensionException {
            if(players.size()!=dimension-1){
                throw new InvalidNumberOfPlayersException("Number of players should be 1 less than dimension");
            }

            if(dimension<3){
                throw new InvalidGameDimensionException("Dimension cant be less than 3");
            }
            return true;
        }

        public Game build(){
            //before building the game , we shoudl validate the game
            try {
                isValid();
            } catch (InvalidNumberOfPlayersException e) {
                System.out.println(e.getMessage());
                return null;
            } catch (InvalidGameDimensionException e) {
                System.out.println(e.getMessage());
                return null;
            }
            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setBoard(new Board(dimension));
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));
            return game;
        }
    }




}
