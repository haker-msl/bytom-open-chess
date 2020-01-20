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
package pl.art.lach.mateusz.openchess.core.board;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author: Mateusz Sławomir Lach 
 */
public class FieldTest {

    @Test
    public void equalsTest() {
        Field fieldA1_1 = Field.getInstance(Field.Letter._A, Field.Number._1);
        Field fieldA1_2 = Field.getInstance(Field.Letter._A, Field.Number._1);
        Field fieldA2 = Field.getInstance(Field.Letter._A, Field.Number._2);
        
        assertEquals(fieldA1_1, fieldA1_2);
        assertNotEquals(fieldA1_1, fieldA2);
        assertNotEquals(fieldA1_2, fieldA2);
        assertNotEquals(null, fieldA1_1);
        assertNotEquals(fieldA1_1, null);
        assertNotEquals(fieldA1_1, "This is not same type");
    }

}