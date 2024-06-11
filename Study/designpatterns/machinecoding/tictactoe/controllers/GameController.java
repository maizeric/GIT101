package designpatterns.machinecoding.tictactoe.controllers;

import designpatterns.machinecoding.tictactoe.models.Game;
import designpatterns.machinecoding.tictactoe.models.GameStatus;
import designpatterns.machinecoding.tictactoe.models.Player;

import java.util.List;

public class GameController {
    public Game CreateGame(int dimension, List<Player> players){
        Game game = Game.getBuilder().setDimension(dimension)
                .setPlayers(players).build();
        return game;
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public void undo(Game game){
    }

    public void executeNextMove(Game game) {
        game.makeNextMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
