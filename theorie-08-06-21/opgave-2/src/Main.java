public class Main {
//======================== code om Rechthoek (opgave 2) te testen ========================


	//---------------------- code om opgave 2(a) te testen --------------------

//	public static void main(String[] args) {
//		Rechthoek re1 = new Rechthoek( 3, 4, 123 );
//		Rechthoek re2 = new Rechthoek( 5, 7, 123 );
//		Rechthoek re3 = new Rechthoek( 4, 3, 123 );
//		Rechthoek re4 = new Rechthoek( 3, 4, 7 );
//		Rechthoek re5 = new Rechthoek( 3, 4, 123 );
//
//		 // vorm verschillend en kleur gelijk
//		System.out.println( re1.equals( re2 ) );    //  false
//
//		 // vorm gelijk maar gedraaid; kleur gelijk
//		System.out.println( re1.equals( re3 ) );    //  true
//
//		 // vorm gelijk; kleur verschillend
//		System.out.println( re1.equals( re4 ) );    //  false
//
//		 // vorm en kleur gelijk
//		System.out.println( re1.equals( re5 ) );    //  true
//	}





//======================== code om Figuur (opgave 2) te testen ========================


	//---------------------- code om opgave 2(b) te testen --------------------

	public static void main(String[] args) {
		Figuur figuur = new Rechthoek( 5, 10, 1 );
		System.out.println( figuur );               //  Rechthoek: 5 x 10 en kleur 1
		System.out.println( figuur.oppervlakte() ); //  50.0
		figuur.roteer();
		System.out.println( figuur );               //  Rechthoek: 10 x 5 en kleur 1

		Vierkant vierkant = new Vierkant( 4, 13 );

		HeeftZijkanten zijkanter = vierkant;
		int n = zijkanter.getAantalZijkanten();
		System.out.println( n );                    //  4

		figuur = vierkant;
		System.out.println( figuur );               //  Vierkant: 4 x 4 en kleur 13
		System.out.println( figuur.oppervlakte() ); //  16.0
		figuur.roteer();
		System.out.println( figuur );               //  Vierkant: 4 x 4 en kleur 13

		figuur = new Cirkel( 2, 77 );
		System.out.println( figuur );               //  Cirkel: straal = 2.0, kleur = 77
		System.out.println( figuur.oppervlakte() ); //  12.566370614359172
		figuur.roteer();
		figuur.setKleur( 808 );
		System.out.println( figuur );               //  Cirkel: straal = 2.0, kleur = 808
	}






}
