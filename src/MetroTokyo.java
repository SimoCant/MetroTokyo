import java.util.HashMap;

public class MetroTokyo {
	public static HashMap<String, Station> estaciones = new HashMap<String, Station>(){{		
		//Creation
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
		
		//Added distances
		get(Constants.YOYOGI).addNearStation(Constants.SHINJUKU, 0.7);
		get(Constants.SHINJUKU).addNearStation(Constants.YOYOGI, 0.7);
			
		get(Constants.HARAJUKU).addNearStation(Constants.YOYOGI, 1.5);
		get(Constants.YOYOGI).addNearStation(Constants.HARAJUKU, 1.5);
		
		get(Constants.SENDAGAYA).addNearStation(Constants.YOYOGI, 1.0);
		get(Constants.YOYOGI).addNearStation(Constants.SENDAGAYA, 1.0); 
		
		get(Constants.SHINJUKU).addNearStation(Constants.SHINOKUBO, 1.3);
		get(Constants.SHINOKUBO).addNearStation(Constants.SHINJUKU, 1.3);
		
		get(Constants.SHINOKUBO).addNearStation(Constants.TAKADANOBABA, 1.4);
		get(Constants.TAKADANOBABA).addNearStation(Constants.SHINOKUBO, 1.4);
		
		get(Constants.TAKADANOBABA).addNearStation(Constants.MEJIRO, 0.9);
		get(Constants.MEJIRO).addNearStation(Constants.TAKADANOBABA, 0.9);
		
		get(Constants.MEJIRO).addNearStation(Constants.IKEBUKURO, 1.2);
		get(Constants.IKEBUKURO).addNearStation(Constants.MEJIRO, 1.2);
		
		get(Constants.IKEBUKURO).addNearStation(Constants.OTSUKA, 1.8);
		get(Constants.OTSUKA).addNearStation(Constants.IKEBUKURO, 1.8);
		
		get(Constants.OTSUKA).addNearStation(Constants.SUGAMO, 1.1);
		get(Constants.SUGAMO).addNearStation(Constants.OTSUKA, 1.1);
		
		get(Constants.SUGAMO).addNearStation(Constants.KOMAGOME, 0.7);
		get(Constants.KOMAGOME).addNearStation(Constants.SUGAMO, 0.7);
		
		get(Constants.KOMAGOME).addNearStation(Constants.TABATA, 1.6);
		get(Constants.TABATA).addNearStation(Constants.KOMAGOME, 1.6);
		
		get(Constants.TABATA).addNearStation(Constants.NISHINIPPORI, 0.8);
		get(Constants.NISHINIPPORI).addNearStation(Constants.TABATA, 0.8);
		
		get(Constants.NISHINIPPORI).addNearStation(Constants.NIPPORI, 0.5);
		get(Constants.NIPPORI).addNearStation(Constants.NISHINIPPORI, 0.5);
		
		get(Constants.NIPPORI).addNearStation(Constants.UGUISUDANI, 1.1);
		get(Constants.UGUISUDANI).addNearStation(Constants.NIPPORI, 1.1);
		
		get(Constants.UGUISUDANI).addNearStation(Constants.UENO, 1.1);
		get(Constants.UENO).addNearStation(Constants.UGUISUDANI, 1.1);
		
		get(Constants.UENO).addNearStation(Constants.OKACHIMACHI, 0.6);
		get(Constants.OKACHIMACHI).addNearStation(Constants.UENO, 0.6);
		
		get(Constants.OKACHIMACHI).addNearStation(Constants.AKIHABARA, 1.0);
		get(Constants.AKIHABARA).addNearStation(Constants.OKACHIMACHI, 1.0);
		
		get(Constants.AKIHABARA).addNearStation(Constants.KANDA, 0.7);
		get(Constants.KANDA).addNearStation(Constants.AKIHABARA, 0.7);
		
		get(Constants.KANDA).addNearStation(Constants.TOKYO, 1.3);
		get(Constants.TOKYO).addNearStation(Constants.KANDA, 1.3);
		
		get(Constants.TOKYO).addNearStation(Constants.YURAKUCHO, 0.8);
		get(Constants.YURAKUCHO).addNearStation(Constants.TOKYO, 0.8);
		
		get(Constants.YURAKUCHO).addNearStation(Constants.SHIMBASHI, 1.1);
		get(Constants.SHIMBASHI).addNearStation(Constants.YURAKUCHO, 1.1);
		
		get(Constants.SHIMBASHI).addNearStation(Constants.HAMAMATSUCHO, 1.2);
		get(Constants.HAMAMATSUCHO).addNearStation(Constants.SHIMBASHI, 1.2);
		
		get(Constants.HAMAMATSUCHO).addNearStation(Constants.TAMACHI, 1.5);
		get(Constants.TAMACHI).addNearStation(Constants.HAMAMATSUCHO, 1.5);
		
		get(Constants.TAMACHI).addNearStation(Constants.SHINAGAWA, 2.2);
		get(Constants.SHINAGAWA).addNearStation(Constants.TAMACHI, 2.2);
		
		get(Constants.SHINAGAWA).addNearStation(Constants.OSAKI, 2.0);
		get(Constants.OSAKI).addNearStation(Constants.SHINAGAWA, 2.0);
		
		get(Constants.OSAKI).addNearStation(Constants.GOTANDA, 0.9);
		get(Constants.GOTANDA).addNearStation(Constants.OSAKI, 0.9);
		
		get(Constants.GOTANDA).addNearStation(Constants.MEGURO, 1.2);
		get(Constants.MEGURO).addNearStation(Constants.GOTANDA, 1.2);
		
		get(Constants.MEGURO).addNearStation(Constants.EBISU, 1.5);
		get(Constants.EBISU).addNearStation(Constants.MEGURO, 1.5);
		
		get(Constants.EBISU).addNearStation(Constants.SHIBUYA, 1.6);
		get(Constants.SHIBUYA).addNearStation(Constants.EBISU, 1.6);
		
		get(Constants.SHIBUYA).addNearStation(Constants.HARAJUKU, 1.2);
		get(Constants.HARAJUKU).addNearStation(Constants.SHIBUYA, 1.2);
			
		//roja Chuo Line (Rapid Service)
		get(Constants.OCHANOMIZU).addNearStation(Constants.TOKYO, 2.6);
		get(Constants.TOKYO).addNearStation(Constants.OCHANOMIZU, 2.6);
				
		get(Constants.SHINJUKU).addNearStation(Constants.OCHANOMIZU, 7.7);
		get(Constants.OCHANOMIZU).addNearStation(Constants.SHINJUKU, 7.7);
		
		//amarilla Sobu Line
		get(Constants.SENDAGAYA).addNearStation(Constants.SHINANOMACHI, 0.7);
		get(Constants.SHINANOMACHI).addNearStation(Constants.SENDAGAYA, 0.7);
		
		get(Constants.SHINANOMACHI).addNearStation(Constants.YOTSUYA, 1.3);
		get(Constants.YOTSUYA).addNearStation(Constants.SHINANOMACHI, 1.3);
		
		get(Constants.YOTSUYA).addNearStation(Constants.IICHIGAYA, 0.8);
		get(Constants.IICHIGAYA).addNearStation(Constants.YOTSUYA, 0.8);
		
		get(Constants.IICHIGAYA).addNearStation(Constants.IIDABASHI, 1.5);
		get(Constants.IIDABASHI).addNearStation(Constants.IICHIGAYA, 1.5);
		
		get(Constants.IIDABASHI).addNearStation(Constants.SUIDOBASHI, 0.9);
		get(Constants.SUIDOBASHI).addNearStation(Constants.IIDABASHI, 0.9);
		
		get(Constants.SUIDOBASHI).addNearStation(Constants.OCHANOMIZU, 0.8);
		get(Constants.OCHANOMIZU).addNearStation(Constants.SUIDOBASHI, 0.8);
		
		get(Constants.OCHANOMIZU).addNearStation(Constants.AKIHABARA, 0.9);
		get(Constants.AKIHABARA).addNearStation(Constants.OCHANOMIZU, 0.9);	
		
		//Add line
		//Line 1 = Yamanote Line (Green)
		//Line 2 = Chuo Line (Red)
		//Line 3 = Sobu Line (Yellow)
		get(Constants.YOYOGI).addLine(1);
		get(Constants.SHINJUKU).addLine(1);
		get(Constants.SHINOKUBO).addLine(1);
		get(Constants.TAKADANOBABA).addLine(1);
		get(Constants.MEJIRO).addLine(1);
		get(Constants.IKEBUKURO).addLine(1);
		get(Constants.OTSUKA).addLine(1);
		get(Constants.SUGAMO).addLine(1);
		get(Constants.KOMAGOME).addLine(1);
		get(Constants.TABATA).addLine(1);
		get(Constants.NISHINIPPORI).addLine(1);
		get(Constants.NIPPORI).addLine(1);
		get(Constants.UGUISUDANI).addLine(1);
		get(Constants.UENO).addLine(1);
		get(Constants.OKACHIMACHI).addLine(1);
		get(Constants.AKIHABARA).addLine(1);
		get(Constants.KANDA).addLine(1);
		get(Constants.TOKYO).addLine(1);
		get(Constants.YURAKUCHO).addLine(1);
		get(Constants.SHIMBASHI).addLine(1);
		get(Constants.HAMAMATSUCHO).addLine(1);
		get(Constants.TAMACHI).addLine(1);
		get(Constants.SHINAGAWA).addLine(1);
		get(Constants.OSAKI).addLine(1);
		get(Constants.GOTANDA).addLine(1);
		get(Constants.MEGURO).addLine(1);
		get(Constants.EBISU).addLine(1);
		get(Constants.SHIBUYA).addLine(1);
		get(Constants.HARAJUKU).addLine(1);

		get(Constants.SHINJUKU).addLine(2);
		get(Constants.TOKYO).addLine(2);
		get(Constants.OCHANOMIZU).addLine(2);

		get(Constants.SHINJUKU).addLine(3);
		get(Constants.YOYOGI).addLine(3);
		get(Constants.SENDAGAYA).addLine(3);
		get(Constants.SHINANOMACHI).addLine(3);
		get(Constants.YOTSUYA).addLine(3);
		get(Constants.IICHIGAYA).addLine(3);
		get(Constants.IIDABASHI).addLine(3);
		get(Constants.SUIDOBASHI).addLine(3);
		get(Constants.AKIHABARA).addLine(3);
		get(Constants.OCHANOMIZU).addLine(3);
	}};			
}