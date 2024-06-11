package designpatterns.machinecoding.tictactoe.exceptions;

public class InvalidNumberOfPlayersException extends Exception{
    public InvalidNumberOfPlayersException(String message){
        super(message);
    }
}
