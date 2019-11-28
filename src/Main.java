import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap <String, Station> stations = new HashMap<>();
		stations.put("Ikebukuro", new Station("Ikebukuro", 139.711389, 35.730278));
		
		System.out.println(stations);
	}
}
