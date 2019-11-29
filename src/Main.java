import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Map <String, Station> stations = new HashMap<>();
		stations.put("Ikebukuro", new Station("Ikebukuro", 139.711389, 35.730278, new HashMap<String, Double>()
			{{ put("Otsuka", 1.8); }}, new ArrayList<Integer>() {{ add(1); }}));
		
		System.out.println(stations);
	}
}
