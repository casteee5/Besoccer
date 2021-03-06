package test.player;

import static org.junit.Assert.*;
import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.player.Player;
import test.config.ConfigTest;

/**
 * JUnit class test for Player
 * All Player methods are tested in this class
 * @author remimarion
 */
public class PlayerTest {

	@Test
	public void testGetPlayer() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Player actual = jfdataManager.getPlayer(44);
		
		assertNotNull(actual);
		assertNotNull(actual.getName());
	}
}
