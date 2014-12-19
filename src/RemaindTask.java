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
  
	public void run() {
		System.out.println("Beeeeeeep");
		try {
		    File soundFile = new File("beep.wav"); //Звуковой файл
		    
		    //Получаем AudioInputStream
		    //Вот тут могут полететь IOException и UnsupportedAudioFileException
		    AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
		    
		    //Получаем реализацию интерфейса Clip
		    //Может выкинуть LineUnavailableException
		    Clip clip = AudioSystem.getClip();
		    
		    //Загружаем наш звуковой поток в Clip
		    //Может выкинуть IOException и LineUnavailableException
		    clip.open(ais);
		    
		    clip.setFramePosition(0); //устанавливаем указатель на старт
		    clip.start(); //Поехали!!!

		    //Если не запущено других потоков, то стоит подождать, пока клип не закончится
		        //В GUI-приложениях следующие 3 строчки не понадобятся
		    Thread.sleep(clip.getMicrosecondLength()/1000);
		    clip.stop(); //Останавливаем
		    clip.close(); //Закрываем
		} catch(IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
		    exc.printStackTrace();
		} catch (InterruptedException exc) {}
    }
}

