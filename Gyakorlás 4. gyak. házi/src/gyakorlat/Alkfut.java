package gyakorlat;

public class Alkfut {

	public static void main(String[] args) {
		Alkalmazott szemely1 = new Alkalmazott();
		Alkalmazott szemely2 = new Alkalmazott();
		
		Alkalmazott[] tomb = new Alkalmazott[5]; 
		
		szemely1.setFizetes(40000);
		szemely1.setNev("Lakatos András");
	
		System.out.println(szemely1.toString());
		
		szemely1.fizetesNovel(5000);
		System.out.println(szemely1.toString());
		
		szemely2.setNevesFizeteses("Réti Berni", 196920);
		System.out.println(szemely2.toString());
		
		System.out.println(szemely1.visszaAd(20000, 70000));
		System.out.println(szemely1.visszaAdSzazalekos());
		System.out.println(szemely1.visszaAdFizetesEldontes(szemely2));
		
		feltolt(tomb);
		kiIras(tomb);
	}
	
	private static void feltolt(Alkalmazott[] tombocske) {
		for (int i = 0; i < tombocske.length; i++) {
			tombocske[i]=new Alkalmazott();
			tombocske[i].setNev("Janos"+ i);
			tombocske[i].setFizetes((int)(Math.random()*50+1));
		}
	}
	
	private static void kiIras(Alkalmazott[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i].toString());
		}
	}

}
