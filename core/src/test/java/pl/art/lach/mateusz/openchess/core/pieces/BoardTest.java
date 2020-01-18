/*
#    This program is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, either version 3 of the License, or
#    (at your option) any later version.
#
#    This program is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU General Public License for more details.
#
#    You should have received a copy of the GNU General Public License
#    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.art.lach.mateusz.openchess.core.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.art.lach.mateusz.openchess.core.Board;
import pl.art.lach.mateusz.openchess.core.board.Field;

/**
 * @author: Mateusz Sławomir Lach 
 */
public class BoardTest {
    
    private Board board = new Board();

    @Test
    public void isInBoardTest() {
        assertTrue(board.isFieldNumberValid(0));
        assertTrue(board.isFieldNumberValid(1));
        assertTrue(board.isFieldNumberValid(2));
        assertTrue(board.isFieldNumberValid(3));
        assertTrue(board.isFieldNumberValid(4));
        assertTrue(board.isFieldNumberValid(5));
        assertTrue(board.isFieldNumberValid(6));
        assertTrue(board.isFieldNumberValid(7));
        
        assertFalse(board.isFieldNumberValid(8));
        assertFalse(board.isFieldNumberValid(9));
        assertFalse(board.isFieldNumberValid(-1));
    }
    
    @Test
    public void boardHasBeenCorrectlyInitiatedTest() {
        Field[][] fields = board.getFields();
        
        for (Field[] row : fields) {
            for (Field column : row) {
                assertNotNull(column);
                assertTrue(column instanceof Field);
            }
        }
    }
    
    @Test
    public void boardFieldsHasCorrectNumbersTest() {
        Field[][] fields = board.getFields();
                
        assertEquals(Field.Letter._A, fields[0][0].getLetter());
        assertEquals(Field.Number._1, fields[0][0].getNumber());
        
        assertEquals(Field.Letter._H, fields[7][7].getLetter());
        assertEquals(Field.Number._8, fields[7][7].getNumber());
    }

}
