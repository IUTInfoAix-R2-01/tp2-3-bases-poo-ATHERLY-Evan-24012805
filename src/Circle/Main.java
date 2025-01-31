package Circle;

public class Main {
	public static void main(String[] args) {
		Circle myCircle = new Circle ();
		System.out.println(myCircle.getRadius());
		Circle secondCircle = new Circle(5.0);
		System.out.println(secondCircle.getRadius());
		System.out.println(secondCircle.getColor());
		secondCircle.setColor("green");
		System.out.println(secondCircle.getColor());
	}
}
