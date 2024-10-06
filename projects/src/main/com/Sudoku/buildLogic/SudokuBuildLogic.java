package main.com.Sudoku.buildLogic;

import main.com.Sudoku.computationLogic.GameLogic;
import main.com.Sudoku.persistance.LocalStorageImpl;
import main.com.Sudoku.problemDomain.IStorage;
import main.com.Sudoku.problemDomain.SudokuGame;
import main.com.Sudoku.userInterface.IUserInterfaceContract;
import main.com.Sudoku.userInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {

    public static void build(IUserInterfaceContract.View userInterface) throws IOException{
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {
            initialState=storage.getGameData();
        }catch (IOException e){
            initialState= GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
