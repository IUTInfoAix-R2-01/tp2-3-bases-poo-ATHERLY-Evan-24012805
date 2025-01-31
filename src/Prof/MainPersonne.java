package Prof;

public class MainPersonne {
	public static void main (String[] args) {
		Personne p1 = new Personne("Laurance", "Ago");
		System.out.println(p1.getNom());
		System.out.println(p1.getPrenom());
		
		Personne p2 = new Personne("Lolo");
		System.out.println(p2.getPrenom());	
		
		System.out.println(p1.toString());	
		System.out.println(p2.toString());	
	}
}
