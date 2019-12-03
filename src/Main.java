import java.util.HashMap;

public class Main {
	private static HashMap<String, Station> stations = MetroTokyo.estaciones;
	public static void main(String[] args) {		
		
		System.out.println("Distance: "+Station.calculateDistance(stations.get(Constants.UENO), stations.get(Constants.NIPPORI)));		
	}
}
