package Rectangle;

public class Main {
	public static void main(String[] args) {
		//creation d'un rectangle de test
		rectangle firstRect = new rectangle();
		System.out.println("premier rectangle");
		System.out.println(firstRect.getLength());
		System.out.println(firstRect.getWidth());
		System.out.println(firstRect.getPerimeter());
		System.out.println(firstRect.getArea());
		//creation d'un deuxieme rectangle
		System.out.println();
		System.out.println("Deuxieme rectangle");
		rectangle Rect = new rectangle(2.0f,3.0f);
		System.out.println("length "+Rect.getLength());
		System.out.println("weidht " +Rect.getWidth());
		System.out.println("perimetre " +Rect.getPerimeter());
		System.out.println("area " +Rect.getArea());
		Rect.setLength(5.0f);
		System.out.println(Rect.getLength());
		System.out.println("nouveau perimetre " + Rect.getPerimeter());
	}
}
