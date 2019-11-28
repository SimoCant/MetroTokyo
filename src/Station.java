import java.util.ArrayList;
import java.util.HashMap;

public class Station {
	
	private String name;
	private double latitude, longitude;
	private HashMap<String, Double> nearStations = new HashMap<>();
	private ArrayList<Integer> lines = new ArrayList<Integer>();
	
	public Station(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
}
