import java.util.HashMap;

public class Station {
	
	private double latitude, longitude;
	private String name;
	private HashMap<String, Double> nearStations = new HashMap<>();

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
	
	public HashMap<String, Double> getNearStations() {
		return nearStations;
	}
	
	public void addNearStation(String name, Double distance) {
		nearStations.put(name, distance);		
	}
	
	public double getDistanceKilometers(Station other) {
		double earthRadius = 6371.0;
		double latDistance = Math.toRadians(latitude - other.getLatitude());
	    double lonDistance = Math.toRadians(longitude - other.getLongitude());
	    double a = Math.sin(latDistance/2)*Math.sin(latDistance/2)
	            + Math.cos(Math.toRadians(latitude))*Math.cos(Math.toRadians(other.getLatitude()))
	            *Math.sin(lonDistance/2)*Math.sin(lonDistance/2);
	    double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = earthRadius*c;
	    return distance;
	}
}
