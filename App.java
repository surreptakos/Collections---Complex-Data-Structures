import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	// usually want to create classes to store data when you know what you want
	// to store in advance. e.g. Use a Person class to store someone's name and
	// ID

	// This is more for when you don't know what you want to store in advance

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" },
			{ "Sue", "Richard", "Bob", "Fred" }, { "Pete", "Mary", "Bob" }, };

	public static void main(String[] args) {
		// Use classes if you can, only use complex data structures when you
		// really need to

		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<>();

			System.out.println("Drivers for Vehicle #" + i + ": " + vehicle);

			for (String driver : driversList) {
				System.out.println("\t" + driver);
				driverSet.add(driver);
			}
			System.out.println();

			personnel.put(vehicle, driverSet);
		}

		{ // Brackets just to scope driversList variable so we can use it again
			// later
			// Example usage
			Set<String> driversList = personnel.get("helicopter");

			for (String driver : driversList) {
				System.out.println(driver);
			}
		}

		// Iterate through whole thing
		for (String vehicle : personnel.keySet()) {
			System.out.println(vehicle);

			Set<String> driversList = personnel.get(vehicle);

			for (String driver : driversList) {
				System.out.println("\t" + driver);
			}
			System.out.println();
		}

	}
}
