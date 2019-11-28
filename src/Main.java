import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {	
		 HashMap<String, Station> stations = new HashMap<String, Station>(){{
			 put(Constants.YOYOGI, new Station(Constants.YOYOGI,35.683828, 139.70232));
			 put(Constants.SHINJUKU, new Station(Constants.SHINJUKU,35.690278, 139.700556));
			 put(Constants.SHINOKUBO, new Station(Constants.SHINOKUBO, 35.701063, 139.700228));
			 put(Constants.TAKADANOBABA, new Station(Constants.TAKADANOBABA, 35.712778,	139.703889));
			 put(Constants.MEJIRO, new Station(Constants.MEJIRO, 35.720994,	139.706881));
			 put(Constants.IKEBUKURO, new Station(Constants.IKEBUKURO, 35.730278, 139.711389));
			 put(Constants.OTSUKA, new Station(Constants.OTSUKA, 35.731439,	139.728692));
			 put(Constants.SUGAMO, new Station(Constants.SUGAMO, 35.733345, 139.739496));			 
			 put(Constants.KOMAGOME, new Station(Constants.KOMAGOME, 35.736289,	139.746995));
			 put(Constants.TABATA, new Station(Constants.TABATA, 35.737909,	139.761254));
			 put(Constants.NISHINIPPORI, new Station(Constants.NISHINIPPORI, 35.731926,	139.7668));
			 put(Constants.NIPPORI, new Station(Constants.NIPPORI, 35.727588, 139.770781));
			 put(Constants.UGUISUDANI, new Station(Constants.UGUISUDANI, 35.722066, 139.777851));
			 put(Constants.UENO, new Station(Constants.UENO, 35.713434, 139.776725));
			 put(Constants.OKACHIMACHI, new Station(Constants.OKACHIMACHI, 35.707327, 139.774847));
			 put(Constants.AKIHABARA, new Station(Constants.AKIHABARA, 35.69824, 139.773731));
			 put(Constants.KANDA, new Station(Constants.KANDA, 35.691731, 139.771264));
			 put(Constants.TOKYO, new Station(Constants.TOKYO, 35.680833, 139.766944));
			 put(Constants.YURAKUCHO, new Station(Constants.YURAKUCHO, 35.674877, 139.763646));
			 put(Constants.SHIMBASHI, new Station(Constants.SHIMBASHI, 35.666301, 139.758679));
			 put(Constants.HAMAMATSUCHO, new Station(Constants.HAMAMATSUCHO, 35.65523, 139.757627));
			 put(Constants.TAMACHI, new Station(Constants.TAMACHI, 35.645605, 139.7477));
			 put(Constants.SHINAGAWA, new Station(Constants.SHINAGAWA, 35.628157, 139.739099));
			 put(Constants.OSAKI, new Station(Constants.OSAKI, 35.6197, 139.72855));
			 put(Constants.GOTANDA, new Station(Constants.GOTANDA, 35.62645, 139.7234));
			 put(Constants.MEGURO, new Station(Constants.MEGURO, 35.633983, 139.716));
			 put(Constants.EBISU, new Station(Constants.EBISU, 35.646643, 139.710045));
			 put(Constants.SHIBUYA, new Station(Constants.SHIBUYA, 35.658514, 139.701331));
			 put(Constants.HARAJUKU, new Station(Constants.HARAJUKU, 35.670162, 139.70269));
			 put(Constants.SENDAGAYA, new Station(Constants.SENDAGAYA, 35.681111, 139.711389));
			 put(Constants.SHINANOMACHI, new Station(Constants.SHINANOMACHI, 35.68, 139.720278));
			 put(Constants.YOTSUYA, new Station(Constants.YOTSUYA, 35.686111, 139.730556));
			 put(Constants.IIDABASHI, new Station(Constants.IIDABASHI, 35.701944, 139.745));
			 put(Constants.IICHIGAYA, new Station(Constants.IICHIGAYA, 35.691111, 139.735556));
			 put(Constants.SUIDOBASHI, new Station(Constants.SUIDOBASHI, 35.702, 139.754));
			 
		 }};
		 
		 
		System.out.println(stations);
	}
}
