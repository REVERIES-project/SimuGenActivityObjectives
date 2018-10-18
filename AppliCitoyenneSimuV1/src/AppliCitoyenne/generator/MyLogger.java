package AppliCitoyenne.generator;

public class MyLogger {

	public static void display(String message) {
		System.out.print(message);
		
	}
	
	public static void displayln(String message) {
		System.out.println(message);
		
	}
	
	public static void displayHeader(String message) {
		System.out.println("\n////--- " + message.toUpperCase() + " ---\\\\\n");
		
	}

}
