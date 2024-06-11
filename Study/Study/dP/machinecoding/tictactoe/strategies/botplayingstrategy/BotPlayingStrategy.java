package Study.dP.machinecoding.tictactoe.strategies.botplayingstrategy;

import designpatterns.machinecoding.tictactoe.models.Board;
import designpatterns.machinecoding.tictactoe.models.Move;
import designpatterns.machinecoding.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
