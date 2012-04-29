/*----------------------------------------------------------------------------*
 * This file is part of Pitaya.                                               *
 * Copyright (C) 2012 Osman KOCAK <kocakosm@gmail.com>                        *
 *                                                                            *
 * This program is free software: you can redistribute it and/or modify it    *
 * under the terms of the GNU Lesser General Public License as published by   *
 * the Free Software Foundation, either version 3 of the License, or (at your *
 * option) any later version.                                                 *
 * This program is distributed in the hope that it will be useful, but        *
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY *
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public     *
 * License for more details.                                                  *
 * You should have received a copy of the GNU Lesser General Public License   *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.       *
 *----------------------------------------------------------------------------*/

package org.pitaya.util;

import static org.pitaya.util.Strings.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * {@code Strings}'s unit tests.
 *
 * @author Osman KOCAK
 */
public final class StringsTest
{
	@Test
	public void testIsNullOrEmpty()
	{
		assertTrue(isNullOrEmpty(null));
		assertTrue(isNullOrEmpty(""));
		assertFalse(isNullOrEmpty("!!"));
	}

	@Test
	public void testEmptyToNull()
	{
		assertNull(emptyToNull(""));
		String str = "Hello world";
		assertEquals(str, emptyToNull(str));
	}

	@Test
	public void testNullToEmpty()
	{
		assertEquals("", nullToEmpty(null));
		String str = "Hello world";
		assertEquals(str, nullToEmpty(str));
	}

	@Test
	public void testConcat()
	{
		assertEquals("", concat());
		assertEquals("Hello world !", concat("Hello ", "world ", "!"));
	}

	@Test
	public void testLStrip()
	{
		assertEquals("world", lstrip("Hello world", 6));
		assertEquals("Hello world", lstrip("Hello world", 0));
		assertEquals("", lstrip("Hello world", 30));
	}

	@Test
	public void testRStrip()
	{
		assertEquals("Hello", rstrip("Hello world", 6));
		assertEquals("Hello world", rstrip("Hello world", 0));
		assertEquals("", rstrip("Hello world", 30));
	}

	@Test
	public void testStrip()
	{
		assertEquals(" ", strip("Hello world", 5));
		assertEquals("Hello world", strip("Hello world", 0));
		assertEquals("", strip("Hello world", 30));
	}

	@Test
	public void testLTrim()
	{
		assertEquals("Hello", ltrim("Hello"));
		assertEquals("Hello ", ltrim("    Hello "));
	}

	@Test
	public void testRTrim()
	{
		assertEquals("Hello", rtrim("Hello"));
		assertEquals(" Hello", rtrim(" Hello      "));
	}

	@Test
	public void testTrim()
	{
		assertEquals("Hello", trim("Hello"));
		assertEquals("Hello", trim("    Hello      "));
	}

	@Test
	public void testReverse()
	{
		assertEquals("enirambus wolleY", reverse("Yellow submarine"));
		String palindrome = "rats live on no evil star";
		assertEquals(palindrome, reverse(palindrome));
	}

	@Test
	public void testLPad()
	{
		assertEquals("Hello", lpad("Hello", 5, '.'));
		assertEquals(".....Hello", lpad("Hello", 10, '.'));
	}

	@Test
	public void testRPad()
	{
		assertEquals("Hello", rpad("Hello", 5, '.'));
		assertEquals("Hello.....", rpad("Hello", 10, '.'));
	}

	@Test
	public void testRepeat()
	{
		assertEquals("", repeat("Hello", 0));
		assertEquals("Hello", repeat("Hello", 1));
		assertEquals("HelloHelloHello", repeat("Hello", 3));
	}
}