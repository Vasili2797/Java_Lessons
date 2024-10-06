package main.com.Sudoku.userInterface.logic;

import main.com.Sudoku.computationLogic.GameLogic;
import main.com.Sudoku.constants.GameState;
import main.com.Sudoku.constants.Messages;
import main.com.Sudoku.problemDomain.IStorage;
import main.com.Sudoku.problemDomain.SudokuGame;
import main.com.Sudoku.userInterface.IUserInterfaceContract;

import java.io.IOException;

public class ControlLogic implements IUserInterfaceContract.EventListener {
    private IStorage storage;
    private IUserInterfaceContract.View view;
    public ControlLogic(IStorage storage, IUserInterfaceContract.View view){
        this.storage=storage;
        this.view=view;
    }
    @Override
    public void onSudokuInput(int x, int y, int input) {
        try{
            SudokuGame gameData = storage.getGameData();
            int[][] newGridState = gameData.getCopyOfGridState();
            newGridState[x][y]=input;
            gameData = new SudokuGame(
                    GameLogic.checkForCompletion(newGridState),
                    newGridState
            );
            storage.updateGameData(gameData);
            view.updateSquare(x,y,input);
            if(gameData.getGameState()== GameState.COMPLETE){
                view.showDialog(Messages.GAME_COMPLETE);
            }
        }catch (IOException e){
            e.printStackTrace();
            view.showError(Messages.ERROR);
        }
    }

    @Override
    public void onDialogClick() {
        try{
            storage.updateGameData(
                    GameLogic.getNewGame()
            );
            view.updateBoard(storage.getGameData());
        }catch (IOException e){
            view.showError(Messages.ERROR);
        }
    }
}
