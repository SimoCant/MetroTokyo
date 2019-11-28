import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {	
		 HashMap<String, Station> stations = new HashMap<String, Station>(){{
			 put(Constants.IKEBUKURO, new Station(Constants.IKEBUKURO, 35.730278, 139.711389));
			 
			 
		 }};
		 
		 
		System.out.println(stations);
	}
}
