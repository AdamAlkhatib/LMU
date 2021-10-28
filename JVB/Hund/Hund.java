public class Hund {

	//Eigenschaften
	private String name;
	private String rasse;
	private int groesse;
	
	//Konstruktor
	public Hund(String name, String rasse, int groesse){
		this.name = name;
		this.rasse = rasse;
		this.groesse = groesse;
		}
	
	//bellen	
	public void bellen() {
		System.out.println(this.name + " bellt! WOOF WOOF!");
	}
	
	//laufen
	public void laufen(String a, String b) {
		System.out.println("Ein Hund rennt! Yayyy! Woof von " + a + " und Woof Woof " + b + "!");
	}

	//main
	public static void main(String[] args) {
		Hund bello = new Hund("Bello", "GrosseHund", 145);
		Hund ismaeel = new Hund ("Ismaeel", "KleinHund", 80);
		Hund kratos = new Hund ("Kratos", "GrieschesHund", 300);
		Hund puffi = new Hund ("Puffi", "KleinWeiss", 50);
		
		bello.bellen();
		bello.laufen("Meunchen", "Berlin");
		
		ismaeel.bellen();
		ismaeel.laufen("Beit Jala", "Bethlehem");
		
		kratos.bellen();
		kratos.laufen("Sparta", "Jotenheim");
		
		puffi.bellen();
		puffi.laufen("Aachen", "Meunchen");
	}
} 