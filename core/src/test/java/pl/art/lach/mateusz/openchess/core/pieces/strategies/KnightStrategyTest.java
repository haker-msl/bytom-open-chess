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
package pl.art.lach.mateusz.openchess.core.pieces.strategies;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import pl.art.lach.mateusz.openchess.core.Color;
import pl.art.lach.mateusz.openchess.core.board.Field;
import pl.art.lach.mateusz.openchess.core.board.Field.Letter;
import pl.art.lach.mateusz.openchess.core.board.Field.Number;

/**
 * @author: Mateusz Sławomir Lach 
 */
public class KnightStrategyTest {
    
    private KnightStrategy knightStrategy = new KnightStrategy();

    @Test
    public void knightFieldsInRangeTest_C4() {
        Field fieldC4 = Field.getInstance(Letter._C, Number._4);
        final Set<Field> fields = knightStrategy.getAllFieldsInRange(fieldC4, Color.WHITE);
        
        Field fieldA3 = Field.getInstance(Letter._A, Number._3);
        Field fieldA5 = Field.getInstance(Letter._A, Number._5);
        
        Field fieldB2 = Field.getInstance(Letter._B, Number._2);
        Field fieldB6 = Field.getInstance(Letter._B, Number._6);
        
        Field fieldD2 = Field.getInstance(Letter._D, Number._2);
        Field fieldD6 = Field.getInstance(Letter._D, Number._6);
        
        Field fieldE3 = Field.getInstance(Letter._E, Number._3);
        Field fieldE5 = Field.getInstance(Letter._E, Number._5);
        
        assertThat(fields, hasItems(fieldA3, fieldA5));
        assertThat(fields, hasItems(fieldB2, fieldB6));
        assertThat(fields, hasItems(fieldD2, fieldD6));
        assertThat(fields, hasItems(fieldE3, fieldE5));
        
     }

}