public class Main {

//======================== code om Garage (opgave 3) te testen ========================


	//---------------------- code om opgave 3 te testen --------------------
	//
	public static void main(String[] args) {
		Garage garage = new Garage();
		Vliegtuig f16 = new Vliegtuig( "F-16" );
		garage.zetInGarage( f16 );
		garage.upgrade( ".upgrade" );


		System.out.println( f16 );               //  F-16
	}
}
