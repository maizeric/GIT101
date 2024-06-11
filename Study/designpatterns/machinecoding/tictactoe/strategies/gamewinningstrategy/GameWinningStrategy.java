package designpatterns.machinecoding.tictactoe.strategies.gamewinningstrategy;

import designpatterns.machinecoding.tictactoe.models.Board;
import designpatterns.machinecoding.tictactoe.models.Move;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);
}
