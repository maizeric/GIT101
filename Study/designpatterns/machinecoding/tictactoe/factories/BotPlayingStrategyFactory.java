package designpatterns.machinecoding.tictactoe.factories;

import designpatterns.machinecoding.tictactoe.models.BotDifficultyLevel;
import designpatterns.machinecoding.tictactoe.strategies.botplayingstrategy.BotPlayingStrategy;
import designpatterns.machinecoding.tictactoe.strategies.botplayingstrategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel){
        if(difficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }
        return new EasyBotPlayingStrategy();
    }
}
