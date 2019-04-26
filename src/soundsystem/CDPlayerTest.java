package soundsystem;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();

    @Autowired
    private CDPlayer player;

    @Test
    public void play(){
        player.play();
        //System.out.print("Playing Lonely heart by The Beatles");
        assertEquals("Playing Lonely heart by The Beatles\r\n", outRule.getLog());
    }
}
