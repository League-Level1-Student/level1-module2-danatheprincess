package _05_minion;

public class Minion {

/*
 * 1. 
Run this MinionTest class. Notice the JUnit tab (by the Package Explorer). It shows a RED bar, because the tests do
not run successfully. Check the Failure Trace below that shows "Minion cannot be resolved to a type". 
This is because there is no Minion class in the package.

2.
 So to make these tests pass, you will first need to create a Minion class with the member variables below:

  			private String name; 
  			private int eyes; 
  			private String color; 
  			private String master;
  			
  			
3.
  Next, create a constructor, and getters and setters for all the member variables of the Minion class. 
  If they’re done right, all these tests will pass.
  
  To check, run this MinionTest class and the JUnit tab should show a GREEN bar.
 */
	private String name; 
		private int eyes; 
		private String color; 
		private String master;

	Minion(String name, int eyes, String color, String master){
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
	String getName() {
		return name;
	}
	int getEyes() {
		return eyes;
	}
	String getColor() {
		return color;
	}
	void setMaster(String master) {
		this.master=master;
	}
	String getMaster() {
		return master;
	}
}
