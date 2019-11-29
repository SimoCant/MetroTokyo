import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Station {
	
	private String name;
	private double latitude, longitude;
	private Map<String, Double> nearStations = new HashMap<>();
	private ArrayList<Integer> lines = new ArrayList<>();
	
	public Station(String name, double longitude, double latitude, HashMap<String, Double> nearStations, ArrayList<Integer> lines) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.nearStations = nearStations;
		this.lines = lines;
	}

	public String getName() {
		return name;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public String toString() {
		return longitude + ", " + latitude + "; near stations: " + nearStations + "; lines" + lines;
	}
}
