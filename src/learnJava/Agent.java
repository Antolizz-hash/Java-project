package learnJava;

public class Agent {
	
	private String firstName;
	private String lastName;
	
	public Agent(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		
		return "My name is " + this.lastName + ", " +this.firstName+" "+this.lastName;
	}
	
	public static void main(String[]args) {
		
		Agent bond = new Agent("James", "Bond");
		bond.toString();
		System.out.println(bond);
		
		Agent ionic = new Agent("Ionic", "Bond");
		ionic.toString();
		System.out.println(ionic);
		
	}

}
