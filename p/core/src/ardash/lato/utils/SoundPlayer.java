/*******************************************************************************
 * Copyright (C) 2015-2023 Andreas Redmer <ar-lato@abga.be>
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
 ******************************************************************************/
package ardash.lato.utils;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

import ardash.lato.A;
import ardash.lato.A.MusicAsset;

/**
 * Warpper for play sound and music. Obeys the Sound-on-off-setting
 */
public class SoundPlayer {
	
	public static void playSound(Sound sound)
	{
		if (sound == null)
				return;
//		if (Pref.getSoundOn())
			sound.play(/*Pref.getSoundVol()*/);
	}
	
	public static void stopSound(Sound sound)
	{
		if (sound == null)
				return;
//		if (Pref.getSoundOn())
			sound.stop();
	}
	
	public static void playSound(Sound sound, float volume)
	{
		if (sound == null)
			return;
//		if (Pref.getSoundOn())
			sound.play(volume/* *Pref.getSoundVol()*/ );
	}

	public static void playMusic(Music music)
	{
		if (music == null)
			return;
		if (/* Pref.getSoundOn() && */ !music.isPlaying())
			music.play();
//		music.setVolume(Pref.getMusicVol());
	}

	public static void stopMusic(Music music)
	{
		if (music == null)
			return;
		if (music.isPlaying())
			music.stop();
	}
	
	public static void pauseMusic(Music music)
	{
		if (music == null)
			return;
			music.pause();
	}

	public static void swapMusicTo(MusicAsset musicAsset)
	{
		if (musicAsset == null)
			return;
		// stop all other musics
		for (MusicAsset ma : MusicAsset.values()) {
			A.getMusic(ma).pause();
		}
		final Music music = A.getMusic(musicAsset);
		if (/* Pref.getSoundOn() && */ !music.isPlaying()) {
			music.play();
			music.setLooping(true);
		}
	}

}
