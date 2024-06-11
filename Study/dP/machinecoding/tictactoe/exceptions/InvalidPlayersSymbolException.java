package designpatterns.machinecoding.tictactoe.exceptions;

public class InvalidPlayersSymbolException extends Exception{
    public InvalidPlayersSymbolException(String message){
        super(message);
    }
}
