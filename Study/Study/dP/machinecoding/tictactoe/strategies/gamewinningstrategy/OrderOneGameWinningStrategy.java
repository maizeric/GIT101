package Study.dP.machinecoding.tictactoe.strategies.gamewinningstrategy;

import designpatterns.machinecoding.tictactoe.models.Board;
import designpatterns.machinecoding.tictactoe.models.Move;
import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{

    List<HashMap<Character,Integer>> rowSymbolCountes = new ArrayList<>();
    List<HashMap<Character,Integer>> colSymbolCounts = new ArrayList<>();

    HashMap<Character, Integer> topLeftDiagonalSymbolCounts = new HashMap<>();

    HashMap<Character, Integer> topRightDiagonalSymbolCounts = new HashMap<>();

    public OrderOneGameWinningStrategy(int dimension){
        for(int i=0;i<dimension;i++){
            rowSymbolCountes.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }

    private boolean isCellOnTopLeftDiagonal(int row, int col){
        return row == col;

    }
    private boolean isCellOnTopRightDiagonal(int row, int col, int dimension){
        if(dimension-(row+col)==1){
            return true;
        }
        return false;
    }
    @Override
    public boolean checkWinner(Board board, Move move) {
        char symbol = move.getPlayer().getSymbol();
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        int dimesnion = board.getBoard().size();

        if(!rowSymbolCountes.get(row).containsKey(symbol)){
            rowSymbolCountes.get(row).put(symbol,0);
        }
        rowSymbolCountes.get(row).put(symbol, rowSymbolCountes.get(row).get(symbol)+1);

        if(!colSymbolCounts.get(col).containsKey(symbol)){
            colSymbolCounts.get(col).put(symbol,0);
        }
        colSymbolCounts.get(col).put(symbol, colSymbolCounts.get(col).get(symbol)+1);

        if(isCellOnTopLeftDiagonal(row, col)){
            if(!topLeftDiagonalSymbolCounts.containsKey(symbol)){
                topLeftDiagonalSymbolCounts.put(symbol, 0);
            }
            topLeftDiagonalSymbolCounts.put(symbol, topLeftDiagonalSymbolCounts.get(symbol)+1);

        }

        if(isCellOnTopRightDiagonal(row, col, dimesnion)){
            if(!topRightDiagonalSymbolCounts.containsKey(symbol)){
                topRightDiagonalSymbolCounts.put(symbol, 0);
            }
            topRightDiagonalSymbolCounts.put(symbol, topRightDiagonalSymbolCounts.get(symbol)+1);

        }

        //Check the winner
        if(rowSymbolCountes.get(row).get(symbol) == dimesnion ||
                colSymbolCounts.get(col).get(symbol) == dimesnion){
            return true;
        }

        if(isCellOnTopLeftDiagonal(row,col) && topLeftDiagonalSymbolCounts.get(symbol) == dimesnion){
            return true;
        }

        if(isCellOnTopRightDiagonal(row,col,dimesnion) && topRightDiagonalSymbolCounts.get(symbol) == dimesnion){
            return true;
        }

        return false;
    }
}
