public class Garage
{
	
	private Vliegtuig vliegtuig;

	public void zetInGarage( Vliegtuig v ) { vliegtuig = v; }

    public void upgrade(String upgradeNaam) {
        // de nieuwe naam voor het Vliegtuig
        upgradeNaam = vliegtuig.getNaam() + upgradeNaam;
        // upgrade het Vliegtuig. Hier geen new Vliegtuig maken, want dat is een ander (nieuw) object.
        // Dan hebben we ineens twee Vliegtuigen, waarvan de nieuwe de geupgrade naam krijgt, terwijl
        // er niks met de oude gedaan wordt (die dan dus onveranderd blijft).
        // We hoeven alleen de naam van het object dat al in het Vliegtuig attribuut van Garage was opgeslagen,
        // aan te passen:
        vliegtuig.setNaam(upgradeNaam);
        // Garage updaten is niet nodig. We hebben het Vliegtuig attribuut van Garage aangepast, dus het staat al goede
        // maar het mag wel natuurlijk, ondanks dat het volkomen overbodig is:  zetInGarage(vliegtuig);
    }
}
