package tomoBayTests.model.royalMail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tomoBay.model.royalMail.RoyalMailNonce;
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

/**
 * @test
 * this class is a unit test case for the RoyalMailNonce class, it makes sure that the integer nonce
 * produced is in Base64 encoding and that the neither the Base64 String nor the integer value repeat
 * within reasonable bounds(10000 iterations)
 * 
 * @pre
 * - none
 * 
 * @post
 * - a non repeating (within at least 10000 iterations) integer nonce is produced
 * - the nonce is encoded in Base64 encoding.
 * 
 * @see tomoBay.model.royalMail.RoyalMailNonce
 * 
 * @author Jan P.C. Hanson
 *
 */
public class RoyalMailNonceTest
{
	/**
	 * @test
	 * instantiation test, makes sure that a RoyalMailNonce object can be instantiated 
	 * 
	 * @pre
	 * - none
	 * 
	 * @post
	 * - a valid RoyalMailNonce object
	 * 
	 * @see tomoBay.model.royalMail.RoyalMailNonce#RoyalMailNonce()
	 */
	@Test
	public final void testRoyalMailNonce()
	{
		try
		{RoyalMailNonce testNonce = new RoyalMailNonce();}
		catch(Exception e)
		{fail("RoyalMailNonce could not be instantiated: "+ e.getMessage());}
	}

	/**
	 * @test
	 * test the get method of the RoyalMailNonce class
	 * 
	 * @pre
	 * - none
	 * 
	 * @post
	 * - 
	 * 
	 * @see tomoBay.model.royalMail.RoyalMailNonce#get()
	 */
	@Test
	public final void testGet()
	{
		fail("Not yet implemented");
	}

}
