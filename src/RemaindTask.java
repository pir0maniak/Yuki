import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


class RemindTask extends TimerTask {
  
	private boolean stop = false;
	
	public void run() {
		System.out.println("Beeeeeeep");
		for (int i = 0; i<5;i++){
		try {
		    File soundFile = new File("beep.wav");
		    AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
		    Clip clip = AudioSystem.getClip();
		    clip.open(ais);
		    clip.setFramePosition(0);
		    clip.start();
		
		} catch(IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
		    exc.printStackTrace();
	} 
    }
}
}

