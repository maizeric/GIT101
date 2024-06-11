package Study.dP.machinecoding.tictactoe;

import designpatterns.machinecoding.tictactoe.controllers.GameController;
import designpatterns.machinecoding.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args){
        System.out.println("Game is Starting");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the game : ");
        int dimension = scanner.nextInt();

        List<Player> players = new ArrayList<>();

        System.out.println("Will there be any bot ? y/n");
        String isBot = scanner.next();
        int noOfHumanPlayers = dimension-1;
        if(isBot.equals("y")){
            noOfHumanPlayers = dimension-2;

            System.out.println("Enter the name of bot");
            String name = scanner.next();

            System.out.println("Enter the symbol of bot");
            String botSymbol = scanner.next();

            players.add(new Bot(botSymbol.charAt(0), name, BotDifficultyLevel.EASY));
        }

        for(int i=0;i<noOfHumanPlayers;i++){
            System.out.println("Enter the name of Player :"+(i+1));
            String name = scanner.next();

            System.out.println("Enter the symbol of player : "+(i+1));
            String symbol = scanner.next();

            Player player = new Player(symbol.charAt(0), name, PlayerType.HUMAN);
            players.add(player);

        }
//In production we dont interact directly with main class
       /* Game game = Game.getBuilder()
                        .setDimension(dimension)
                        .setPlayers(players)
                        .build();*/

        GameController gameController = new GameController();
        Game game = gameController.CreateGame(dimension,players);

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            //Players will play the game
            System.out.println("This is the current Board : ");
            gameController.displayBoard(game);

            System.out.println("Do you want to Undo ? y/n");
            String input = scanner.next();
            if(input.equals("y")){
                gameController.undo(game);
            } else {
                gameController.executeNextMove(game);

            }
        }

        if(gameController.getGameStatus(game).equals(GameStatus.DRAW)){
            System.out.println("Game has been drawn");
        }
        if(gameController.getGameStatus(game).equals(GameStatus.ENDED)){

            System.out.println("");
            //Some one has won the game
            System.out.println("Game has been finished");
            System.out.println("Winner is "+ gameController.getWinner(game).getName());
        }
    }
}
