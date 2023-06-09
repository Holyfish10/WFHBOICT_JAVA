public class Rechthoek extends Figuur implements HeeftZijkanten
{

	private int lengte;
	private int breedte;
	//private int kleur; //nodig bij de equals-opgave, maar verboden (vanaf dat moment gebruiken de kleur van Figuur)

	public Rechthoek( int lengte, int breedte, int kleur ) {
		super( kleur ); // toegevoegd
		this.lengte = lengte;
		this.breedte = breedte;
		//kleurnummer = kleur; //verwijderd t.o.v. opgave over equals

	}

	public double oppervlakte() {
		return lengte * breedte; 
		}

	public void roteer() {
		int hulp = lengte;
		lengte = breedte;
		breedte = hulp;
	}

	public String toString() {
		String rhOfVkTxt = "Rechthoek";
		if( this instanceof Vierkant ) { //Vierkant-klasse mocht geen eigen toString hebben. Maar Vierkant is een Rechthoek (maar dan een speciale)
										//dus we kunnen instanceof gebruiken om te checken wat voor soort Rechthoek dit is.
										//Wat niet de bedoeling was (maar wel goed gerekend is) is, dat je hier checkt of lengte==breedte.
										//Dat is eigenlijk niet goed, omdat een new Rechthoek(10,10) wel lengte==breedte heeft, maar beslist
										//GEEN Vierkant-OBJECT is.
			rhOfVkTxt = "Vierkant";
		}
		return rhOfVkTxt + ": " + lengte + " x " + breedte + " en kleur " + kleur;
	}

	

	// equals die zich houdt aan de eisen in de toets:
	public boolean equals( Object obj ) {
		if ( !( obj instanceof Rechthoek ) ) {
			return false;
		}
		Rechthoek r = ( Rechthoek ) obj;
		if ( this.kleur != r.kleur ) {
			return false; // hopeloos
		}
		boolean variant1 = (this.lengte == r.lengte && this.breedte == r.breedte);
		boolean variant2 = (this.lengte == r.breedte && this.breedte == r.lengte); //gedraaid
		return variant1 || variant2;  //ok als normaal of gedraaid gelijke afmetingen.
		// n.b. wat niet werkt, is kijken of de oppervlakte hetzelfde is (10x2 is zelfde oppervlakte als 5x4 maar de rechthoeken zijn van verschillende vorm)
	}
	

	public int getAantalZijkanten() { return 4; }
}


