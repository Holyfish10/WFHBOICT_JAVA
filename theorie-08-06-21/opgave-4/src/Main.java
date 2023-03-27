public class Main {
    //======================== code om Vliegveld (opgave 4) te testen ========================


	//---------------------- code om opgave 4(b) te testen --------------------
//	public static void main(String[] args) {
//		Vliegveld veld = new Vliegveld( 3 );
//
//		Vliegtuig f16 = new Vliegtuig( "F-16" );
//		veld.zetBinnen( f16, 2 );
//
//		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
//		veld.zetBinnen( boeing, 2 );                      //  hangar 2 is al bezet
//		veld.zetBinnen( boeing, 3210 );                   //  hangar 3210 bestaat niet!
//		veld.zetBinnen( boeing, 1 );
//
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: ---
//		                                                  // * plek 1: Boeing 747
//		                                                  // * plek 2: F-16
//	}




	//---------------------- code om opgave 4(c) te testen --------------------
	//
//	public static void main(String[] args) {
//		Vliegveld veld = new Vliegveld( 3 );
//
//		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
//		veld.zetBinnen( boeing, 2 );
//
//		Vliegtuig f16 = new Vliegtuig( "F-16" );
//		veld.zetBinnen( f16, 1 );
//
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: ---
//		                                                  // * plek 1: F-16
//		                                                  // * plek 2: Boeing 747
//
//		Vliegtuig x = veld.haalEruit( 2 );
//		System.out.println( x );                          //  Boeing 747
//
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: ---
//		                                                  // * plek 1: F-16
//		                                                  // * plek 2: ---
//
//		Vliegtuig y = veld.haalEruit( 0 );
//		System.out.println( y );                          //  null
//	}
//



	//---------------------- code om opgave 4(d) te testen --------------------
	//
//	public static void main(String[] args) {
//		Vliegveld veld = new Vliegveld( 5 );
//
//		Vliegtuig dc10 = new Vliegtuig( "DC-10" );
//		veld.zetBinnen( dc10, 4 );
//
//		Vliegtuig f16 = new Vliegtuig( "F-16" );
//		veld.zetBinnen( f16, 0 );
//
//		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
//		veld.zetBinnen( boeing, 1 );
//
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: F-16
//		                                                  // * plek 1: Boeing 747
//		                                                  // * plek 2: ---
//		                                                  // * plek 3: ---
//		                                                  // * plek 4: DC-10
//
//		Vliegtuig concorde = new Vliegtuig( "Concorde" );
//		int vrij = veld.zetOpEersteVrijePlek( concorde );
//		System.out.println( vrij );                       //  2
//
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: F-16
//		                                                  // * plek 1: Boeing 747
//		                                                  // * plek 2: Concorde
//		                                                  // * plek 3: ---
//		                                                  // * plek 4: DC-10
//	}
}
