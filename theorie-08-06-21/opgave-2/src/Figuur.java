public abstract class Figuur implements Rotatie
{

	protected int kleur;

	public Figuur( int kleur ) { this.kleur = kleur; }

	public void setKleur( int kleur ) { this.kleur = kleur; }


	public abstract double oppervlakte();
}


