import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Station {
	
	private String name;
	private double latitude, longitude;
	private Map<String, Double> nearStations = new HashMap<>();
	private ArrayList<Integer> lines = new ArrayList<>();
	
	public Station(String name, double latitude, double longitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public static double calculateDistance(Station s1, Station s2) {		
		final int R = 6371; // Radius of the earth

	    double latDistance = Math.toRadians(s2.getLatitude() - s1.getLatitude());
	    double lonDistance = Math.toRadians(s2.getLongitude() - s1.getLongitude());
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(s1.getLatitude())) * Math.cos(Math.toRadians(s2.getLatitude()))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c;

	    return distance;
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
		return longitude + ", " + latitude + "; near stations: " + nearStations + "; lines" + lines + "\n";
	}
	
	public void addNearStation(String name, Double distance) {
		nearStations.put(name, distance);		
	}
	
	public void addLine(Integer line) {
		lines.add(line);		
	}
}
