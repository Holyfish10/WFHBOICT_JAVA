public class Main {
    //============================= code om PicPoc te testen =============================


	public static void main(String[] args) {
		PicPoc account1 = new PicPoc();
		Plaatje img = new Plaatje( 1, 2 );               //  Plaatje: 1, 2
		account1.uploadPlaatje( img );

		 // klopt het plaatje nog wel?
		account1.toon();                                 //  Plaatje: 1, 2

		 // deel het met de wereld!
		Plaatje gedownload = account1.downloadPlaatje();

		 // iemand verandert het gedownloade plaatje
		gedownload.pixel1 = 777;
		gedownload.toon();                               //  Plaatje: 777, 2

		 // Bekijk het plaatje in de account nog eens.
		 // Dat zou natuurlijk hetzelfde moeten zijn als aan het begin
		account1.toon();                                 //  Plaatje: 1, 2
	}



}
