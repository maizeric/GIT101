package designpatterns.machinecoding.tictactoe.exceptions;

public class InvalidGameDimensionException extends Exception {
    public InvalidGameDimensionException(String message){
        super(message);
    }
}
