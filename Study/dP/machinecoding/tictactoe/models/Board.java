package designpatterns.machinecoding.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    public List<List<Cell>> getBoard() {
        return board;
    }

    public Board(int dimension) {
        this.board = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            this.board.add(new ArrayList<>());
            for (int j = 0; j < dimension; j++) {
                this.board.get(i).add(new Cell(i, j));
            }
        }
    }


    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void applyMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        this.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        this.getBoard().get(row).get(col).setPlayer(move.getPlayer());
    }

    public void displayBoard() {
        //Print the board
        for(int i=0;i<board.size();i++){
            for(int j=0;j<board.size();j++){
                if(board.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    System.out.print("|  |");
                } else{
                    System.out.print("| "+board.get(i).get(j).getPlayer().getSymbol()+" |");
                }
            }
            System.out.println();
        }
    }
}
