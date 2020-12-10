package story;

import java.io.*;
import java.util.Properties;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class StoryEdit{
    public Properties story = new Properties();


    public StoryEdit() throws IOException {
        FileWriter file = new FileWriter("resource/story/story.properties") ;
        story.setProperty("/tag" + "sequence","content");//use each sentence once,
                                                         // The same character scene is the same tag
                                                         // and the sequence of statements is the sequence
        story.store(file,null);
    }

    public static void main(String arg[]) throws IOException {
        new StoryEdit();
    }
}
