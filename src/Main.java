import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		double totalDistance;
		AStar a = new AStar();		
		ArrayList<String> path;
		
		path = a.findPath("Shinjuku", "Ochanomizu");
		if(path == null)
			System.out.println("No path found");
		else {
			totalDistance = a.getTotalDistance(path);
			System.out.println("The best path is: " + path);
			System.out.println("Total distance: " + totalDistance);
		}		
	}
}
