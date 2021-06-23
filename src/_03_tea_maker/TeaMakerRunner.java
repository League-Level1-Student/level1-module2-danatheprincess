package _03_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag tea=new TeaBag(TeaBag.PASSION_FRUIT);
	Kettle water=new Kettle();
	water.boil();
	Cup mug=new Cup();
	mug.makeTea(tea, water.getWater());
}
}
