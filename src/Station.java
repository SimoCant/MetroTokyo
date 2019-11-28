import java.util.ArrayList;
import java.util.HashMap;

public class Station {
	
	private String name;
	private double latitude, longitude;
	private HashMap<String, Double> nearStations = new HashMap<>();
	private ArrayList<Integer> lines = new ArrayList<>();
	
	public Station(String name, double latitude, double longitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
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
		return name;
	}
	
	public void addNearStation(String name, Double distance) {
		nearStations.put(name, distance);		
	}
}
