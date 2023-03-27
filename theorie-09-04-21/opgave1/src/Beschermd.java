public class Beschermd
{
	// moet altijd groter of gelijk aan 10 zijn.
	private int getal = 12345;  // niet vergeten om 'm private te maken, anders helpen de setter en constructor met beshermende logica niet.
	private static int aantal_illegaal = 0; // static attributen nodig, omdat we iets moeten bijhouden dat over meerdere objecten gaat.
	private static int aantal_legaal = 0;

	private static int grens = 10; // mocht ook hardcoded getal in setter en constructor

	public Beschermd(int getal) { 
		// Omdat getal by default op 12345 staat (declaratie van het attribuut hierboven), kunnen we nu gewoon setGetal aanroepen.
		// Als je getal bij de declaratie een andere waarde geeft (of niks doet: "private int getal; " dan moet je er op een andere manier voor zorgen
		// dat de constructor getal =p 12345 zet als de input illegaal is.
		setGetal(getal);
	}

	public String toString() { return "Beschermd: getal = " + getal; }


	public void setGetal(int getal) {
		if (getal >= grens) 
		{
			System.out.println("ok");
			this.getal = getal;
			aantal_legaal++;		
		} 
		else 
		{
			System.out.println("mag niet");
			aantal_illegaal++;
		}
	}



	public static void printLogging() {
		System.out.print("# ok = " + aantal_legaal + ", ");
		System.out.println("# mag niet = " + aantal_illegaal);
	}
}
