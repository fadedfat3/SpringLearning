package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Lonely heart";
    private String artist = "The Beatles";
    public void play(){
        System.out.println("Playing " + title + " by " + artist);
    }
}
