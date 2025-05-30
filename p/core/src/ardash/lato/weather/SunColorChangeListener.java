package ardash.lato.weather;

import com.badlogic.gdx.graphics.Color;

public interface SunColorChangeListener {
	
	/**
	 * Change a color in the defined period of time.
	 * @param target The target color.
	 * @param seconds The time period to perform the change in seconds.
	 */
	void onSunColorChangeTriggered(Color target, float seconds);

}
