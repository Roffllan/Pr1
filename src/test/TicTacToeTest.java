package test;

import main.TicTacToe;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
public class TicTacToeTest {


    @Test
    public void testAddTic() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(1);
        addChar.addCharX(2);
        addChar.addCharX(3);
        assertEquals("x", addChar.getState(1));
        assertEquals("x", addChar.getState(2));
        assertEquals("x", addChar.getState(3));
        assertEquals("-", addChar.getState(5));
    }


    @Test
    public void testAddTac() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharO(7);
        addChar.addCharO(8);
        addChar.addCharO(9);
        assertEquals("o", addChar.getState(7));
        assertEquals("o", addChar.getState(8));
        assertEquals("o", addChar.getState(9));
        assertEquals("-", addChar.getState(6));
    }
    @Test
    public void testRemove() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(7);
        addChar.addCharO(8);
        addChar.addCharX(9);
        assertEquals("-", addChar.cleaner(7));
        assertEquals("-", addChar.cleaner(8));
        assertEquals("-", addChar.cleaner(9));
    }
    @Test
    public void longestDiagonalTic() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(1);
        addChar.addCharX(3);
        addChar.addCharO(2);
        addChar.addCharO(6);
        addChar.addCharO(4);
        addChar.addCharX(5);
        assertEquals(2, addChar.maxXDiag());
    }
    @Test
    public void longestSequenceTic() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(1);
        addChar.addCharX(2);
        addChar.addCharX(6);
        addChar.addCharO(8);
        addChar.addCharO(9);
        assertEquals(2, addChar.maxX());
    }
    @Test
    public void longestSequenceTac() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharO(1);
        addChar.addCharX(2);
        addChar.addCharX(6);
        addChar.addCharO(4);
        addChar.addCharO(7);
        addChar.addCharO(9);
        assertEquals(3, addChar.maxO());
    }
    @Test
    public void longestDiagonalTac() throws IOException {
        TicTacToe.GameXO addChar = new TicTacToe.GameXO(3);
        addChar.addCharX(1);
        addChar.addCharX(4);
        addChar.addCharO(7);
        addChar.addCharO(5);
        addChar.addCharO(3);
        addChar.addCharX(8);
        assertEquals(3, addChar.maxODiag());
    }
}