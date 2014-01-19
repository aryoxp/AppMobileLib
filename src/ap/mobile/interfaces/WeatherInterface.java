package ap.mobile.interfaces;

import ap.mobile.base.Weather;

public interface WeatherInterface {
	public void weatherLoaded(Weather weather);
	public void weatherLoadError(String error);
	public void weatherLoadStart();
}
