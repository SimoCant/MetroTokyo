import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {	
		 HashMap<String, Station> stations = new HashMap<String, Station>(){{
			 put(Constants.YOYOGI, new Station(Constants.YOYOGI,35.683828, 139.70232));
			 put(Constants.SHINJUKU, new Station(Constants.SHINJUKU,35.690278, 139.700556));
			 put(Constants.OCHANOMIZU, new Station(Constants.OCHANOMIZU,35.699722, 139.763889));
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
		
		 //verde
		 
		stations.get(Constants.YOYOGI).addNearStation(Constants.SHINJUKU, 0.7);
		stations.get(Constants.SHINJUKU).addNearStation(Constants.YOYOGI, 0.7);
		
		stations.get(Constants.HARAJUKU).addNearStation(Constants.YOYOGI, 1.5);
		stations.get(Constants.YOYOGI).addNearStation(Constants.HARAJUKU, 1.5);
		
		stations.get(Constants.SENDAGAYA).addNearStation(Constants.YOYOGI, 1.0);
		stations.get(Constants.YOYOGI).addNearStation(Constants.SENDAGAYA, 1.0); 
		
		stations.get(Constants.SHINJUKU).addNearStation(Constants.SHINOKUBO, 1.3);
		stations.get(Constants.SHINOKUBO).addNearStation(Constants.SHINJUKU, 1.3);
		
		stations.get(Constants.SHINOKUBO).addNearStation(Constants.TAKADANOBABA, 1.4);
		stations.get(Constants.TAKADANOBABA).addNearStation(Constants.SHINOKUBO, 1.4);
		
		stations.get(Constants.TAKADANOBABA).addNearStation(Constants.MEJIRO, 0.9);
		stations.get(Constants.MEJIRO).addNearStation(Constants.TAKADANOBABA, 0.9);

		stations.get(Constants.MEJIRO).addNearStation(Constants.IKEBUKURO, 1.2);
		stations.get(Constants.IKEBUKURO).addNearStation(Constants.MEJIRO, 1.2);

		stations.get(Constants.IKEBUKURO).addNearStation(Constants.OTSUKA, 1.8);
		stations.get(Constants.OTSUKA).addNearStation(Constants.IKEBUKURO, 1.8);

		stations.get(Constants.OTSUKA).addNearStation(Constants.SUGAMO, 1.1);
		stations.get(Constants.SUGAMO).addNearStation(Constants.OTSUKA, 1.1);

		stations.get(Constants.SUGAMO).addNearStation(Constants.KOMAGOME, 0.7);
		stations.get(Constants.KOMAGOME).addNearStation(Constants.SUGAMO, 0.7);

		stations.get(Constants.KOMAGOME).addNearStation(Constants.TABATA, 1.6);
		stations.get(Constants.TABATA).addNearStation(Constants.KOMAGOME, 1.6);

		stations.get(Constants.TABATA).addNearStation(Constants.NISHINIPPORI, 0.8);
		stations.get(Constants.NISHINIPPORI).addNearStation(Constants.TABATA, 0.8);

		stations.get(Constants.NISHINIPPORI).addNearStation(Constants.NIPPORI, 0.5);
		stations.get(Constants.NIPPORI).addNearStation(Constants.NISHINIPPORI, 0.5);

		stations.get(Constants.NIPPORI).addNearStation(Constants.UGUISUDANI, 1.1);
		stations.get(Constants.UGUISUDANI).addNearStation(Constants.NIPPORI, 1.1);

		stations.get(Constants.UGUISUDANI).addNearStation(Constants.UENO, 1.1);
		stations.get(Constants.UENO).addNearStation(Constants.UGUISUDANI, 1.1);

		stations.get(Constants.UENO).addNearStation(Constants.OKACHIMACHI, 0.6);
		stations.get(Constants.OKACHIMACHI).addNearStation(Constants.UENO, 0.6);

		stations.get(Constants.OKACHIMACHI).addNearStation(Constants.AKIHABARA, 1.0);
		stations.get(Constants.AKIHABARA).addNearStation(Constants.OKACHIMACHI, 1.0);

		stations.get(Constants.AKIHABARA).addNearStation(Constants.KANDA, 0.7);
		stations.get(Constants.KANDA).addNearStation(Constants.AKIHABARA, 0.7);

		stations.get(Constants.KANDA).addNearStation(Constants.TOKYO, 1.3);
		stations.get(Constants.TOKYO).addNearStation(Constants.KANDA, 1.3);

		stations.get(Constants.TOKYO).addNearStation(Constants.YURAKUCHO, 0.8);
		stations.get(Constants.YURAKUCHO).addNearStation(Constants.SHIMBASHI, 1.1);
		stations.get(Constants.SHIMBASHI).addNearStation(Constants.HAMAMATSUCHO, 1.2);
		stations.get(Constants.HAMAMATSUCHO).addNearStation(Constants.TAMACHI, 1.5);
		stations.get(Constants.TAMACHI).addNearStation(Constants.SHINAGAWA, 2.2);
		stations.get(Constants.SHINAGAWA).addNearStation(Constants.OSAKI, 2.0);
		stations.get(Constants.OSAKI).addNearStation(Constants.GOTANDA, 0.9);
		stations.get(Constants.GOTANDA).addNearStation(Constants.MEGURO, 1.2);
		stations.get(Constants.MEGURO).addNearStation(Constants.EBISU, 1.5);
		stations.get(Constants.EBISU).addNearStation(Constants.SHIBUYA, 1.6);
		stations.get(Constants.SHIBUYA).addNearStation(Constants.HARAJUKU, 1.2);

		//amarilla
		stations.get(Constants.SENDAGAYA).addNearStation(Constants.SHINANOMACHI, 0.7);
		stations.get(Constants.SHINANOMACHI).addNearStation(Constants.SENDAGAYA, 0.7);

		stations.get(Constants.SHINANOMACHI).addNearStation(Constants.YOTSUYA, 1.3);
		stations.get(Constants.YOTSUYA).addNearStation(Constants.SHINANOMACHI, 1.3);

		stations.get(Constants.YOTSUYA).addNearStation(Constants.IICHIGAYA, 0.8);
		stations.get(Constants.IICHIGAYA).addNearStation(Constants.YOTSUYA, 0.8);
		
		stations.get(Constants.IICHIGAYA).addNearStation(Constants.IIDABASHI, 1.5);
		stations.get(Constants.IIDABASHI).addNearStation(Constants.IICHIGAYA, 1.5);
		
		stations.get(Constants.IIDABASHI).addNearStation(Constants.SUIDOBASHI, 0.9);
		stations.get(Constants.SUIDOBASHI).addNearStation(Constants.IIDABASHI, 0.9);
		
		stations.get(Constants.SUIDOBASHI).addNearStation(Constants.OCHANOMIZU, 0.8);
		stations.get(Constants.OCHANOMIZU).addNearStation(Constants.SUIDOBASHI, 0.8);

		stations.get(Constants.OCHANOMIZU).addNearStation(Constants.AKIHABARA, 0.9);
		stations.get(Constants.AKIHABARA).addNearStation(Constants.OCHANOMIZU, 0.9);

		
		//roja
		stations.get(Constants.OCHANOMIZU).addNearStation(Constants.TOKYO, 2.6);
		stations.get(Constants.TOKYO).addNearStation(Constants.OCHANOMIZU, 2.6);
		
		stations.get(Constants.SHINJUKU).addNearStation(Constants.OCHANOMIZU, 7.7);
		stations.get(Constants.OCHANOMIZU).addNearStation(Constants.SHINJUKU, 7.7);


		
	




		System.out.println(stations);
	}
}
