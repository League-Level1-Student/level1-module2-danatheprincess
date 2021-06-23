package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	
	SeaCreature bob=new SeaCreature("Spongebob");
	System.out.println(bob.getName());
	bob.eat();
	bob.laugh();
	
	bob=new SeaCreature("Patrick");
	System.out.println(bob.getName());
	bob.eat();
	bob.laugh();
	
	bob=new SeaCreature("Squidward");
	System.out.println(bob.getName());
	bob.eat();
	bob.laugh();
}
}
