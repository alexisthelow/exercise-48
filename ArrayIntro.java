public class ArrayIntro {
	public static void main(String[] args) {
		String[] planets = {"Mercury", "Venus", "Earth", "Mars",
							"Jupiter", "Saturn", "Uranus", "Neptune"};
		
		for (String p : planets) {
			System.out.println(p + "\t" + p.toUpperCase());
		}
		
		String[] girlfriends = {"Brenda", "Bailie", "Jennifer", "Julianne", "Danielle", 
								"Jasmine"};	
								
		for (String g : girlfriends) {
			System.out.println("I dated a girl named " + g + ".");
		}
	}
}