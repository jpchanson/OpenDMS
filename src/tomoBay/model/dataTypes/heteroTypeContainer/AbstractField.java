package tomoBay.model.dataTypes.heteroTypeContainer;
/** Copyright(C) 2015 Jan P.C. Hanson & Tomo Motor Parts Limited
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import tomoBay.helpers.NoImports;
/**
 * This interface is the abstract base for all derived AbstractDBField types, and represents a
 * a column of a database table. The type method is primarily for the use of the DBFieldContainer.
 * The size method is for the user of a particular derived type to be able to check the stated size
 * of the DB field.
 * 
 * @author Jan P.C. Hanson
 *
 */
@SuppressWarnings("unused")
public interface AbstractField
{
	/**
	 * returns the type of this particular Database field as a string
	 * @return String containing the type of this field as defined by a constant in the TypeDef Class
	 */
	public abstract String type();
	
	/**
	 * the size of the field,  
	 * @return int representing the number of characters/digits/bytes/etc allocated to this 
	 * particular field
	 */
	public abstract int size();
}
