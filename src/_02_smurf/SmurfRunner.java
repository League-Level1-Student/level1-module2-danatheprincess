package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf smurf =new Smurf("Handy Joe");
	System.out.println(smurf.getName());
	smurf.eat();
	
	smurf=new Smurf("Papa");
	System.out.println(smurf.getName());
	System.out.println("My hat is "+smurf.getHatColor());
	System.out.println(smurf.isGirlOrBoy());
	
	smurf=new Smurf("Smurfette");
	System.out.println(smurf.getName());
	System.out.println("My hat is "+smurf.getHatColor());
	System.out.println(smurf.isGirlOrBoy());
}
}
