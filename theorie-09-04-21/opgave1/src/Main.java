public class Main {
    //========================== code om Beschermd te testen ===========================


	// vraag 1a
//	public static void main(String[] args) {
//		Beschermd a = new Beschermd( 88888 ); //  ok
//		System.out.println( a );              //  Beschermd: getal = 88888
//	}




	// vraag 1b
//	public static void main(String[] args) {
//		Beschermd a = new Beschermd( 777777 ); //  ok
//		a.setGetal( 2 );                       //  mag niet
//		System.out.println( a );               //  Beschermd: getal = 777777
//		a.setGetal( 333 );                     //  ok
//		System.out.println( a );               //  Beschermd: getal = 333
//
//		Beschermd b = new Beschermd( -1 );     //  mag niet
//		System.out.println( b );               //  Beschermd: getal = 12345
//	}




	// vraag 1c
//	public static void main(String[] args) {
//		Beschermd.printLogging();             //  # ok = 0, # mag niet = 0
//
//		Beschermd a = new Beschermd( 777 );   //  ok
//		Beschermd b = new Beschermd( -1 );    //  mag niet
//		b.setGetal( 123 );                    //  ok
//		Beschermd c = new Beschermd( 98765 ); //  ok
//
//		Beschermd.printLogging();             //  # ok = 3, # mag niet = 1
//
//		Beschermd d = new Beschermd( 100 );   //  ok
//		d.setGetal( -1 );                     //  mag niet
//		Beschermd.printLogging();             //  # ok = 4, # mag niet = 2
//	}
}
