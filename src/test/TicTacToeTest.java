package test;
import main.TicTacToe;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
public class TicTacToeTest {


    @Test
    public void testAddTic() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(0,0);
        addChar.addCharX(0,1);
        addChar.addCharX(0,2);
        assertEquals(TicTacToe.GameXO.Players.X, addChar.getState(0,0));
        assertEquals(TicTacToe.GameXO.Players.X, addChar.getState(0,1));
        assertEquals(TicTacToe.GameXO.Players.X, addChar.getState(0,2));
        assertEquals(TicTacToe.GameXO.Players.emp, addChar.getState(1,1));
    }


    @Test
    public void testAddTac() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharO(2,0);
        addChar.addCharO(2,1);
        addChar.addCharO(2,2);
        assertEquals(TicTacToe.GameXO.Players.O, addChar.getState(2,0));
        assertEquals(TicTacToe.GameXO.Players.O, addChar.getState(2,1));
        assertEquals(TicTacToe.GameXO.Players.O, addChar.getState(2,2));
        assertEquals(TicTacToe.GameXO.Players.emp, addChar.getState(1,2));
    }
    @Test
    public void testRemove() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(2,0);
        addChar.addCharO(2,1);
        addChar.addCharX(2,2);
        assertEquals(TicTacToe.GameXO.Players.emp, addChar.cleaner(2,0));
        assertEquals(TicTacToe.GameXO.Players.emp, addChar.cleaner(2,1));
        assertEquals(TicTacToe.GameXO.Players.emp, addChar.cleaner(2,2));
    }
    @Test
    public void longestDiagonalTic() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(0,0);
        addChar.addCharX(0,2);
        addChar.addCharO(0,1);
        addChar.addCharO(1,2);
        addChar.addCharO(1,0);
        addChar.addCharX(1,1);
        assertEquals(2, addChar.maxXDiag());
    }
    @Test
    public void longestSequenceTic() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(0,0);
        addChar.addCharX(0,1);
        addChar.addCharX(1,2);
        addChar.addCharO(2,1);
        addChar.addCharO(2,2);
        assertEquals(2, addChar.maxX());
    }
    @Test
    public void longestSequenceTac() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharO(0,0);
        addChar.addCharX(0,1);
        addChar.addCharX(1,2);
        addChar.addCharO(1,0);
        addChar.addCharO(2,0);
        addChar.addCharO(2,2);
        assertEquals(3, addChar.maxO());
    }
    @Test
    public void longestDiagonalTac() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(0,0);
        addChar.addCharX(1,0);
        addChar.addCharO(2,0);
        addChar.addCharO(1,1);
        addChar.addCharO(0,2);
        addChar.addCharX(2,1);
        assertEquals(3, addChar.maxODiag());
    }
}