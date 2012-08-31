/*
 * Created on 05-Jan-2005
 *
 * By Mike Anderson
 */
package mikera.tyrant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import mikera.engine.Lib;
import mikera.engine.Thing;

/**
 * @author Mike
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class TestAnimal {

	@Test
	public void testButterfly() {
		Thing t=Lib.create("butterfly");
		
		assertNull(t.get("DeathDecoration"));
	}
}