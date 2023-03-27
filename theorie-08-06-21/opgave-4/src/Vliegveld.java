public class Vliegveld
{
    /////////////////////////////////////// (a) //////////////////////////////////////////////////////
	
	private Vliegtuig[] hangar;  //public/private etc. niet belangrijk in deze opgave

	public Vliegveld( int grootte ) { hangar = new Vliegtuig[grootte]; }
	
    /////////////////////////////////////// (b) //////////////////////////////////////////////////////

	public void zetBinnen( Vliegtuig v, int plek ) {
		if( plek < 0 || plek >= hangar.length )
		{
			System.out.println( "hangar " + plek + " bestaat niet!" );
			return;
		}
		if( hangar[plek] == null ) {
			hangar[plek] = v;
		}
		else {
			System.out.println( "hangar " + plek + " is al bezet" );
		}
	}

	public void print() {
		System.out.println( "hangar:" );
		for ( int i = 0; i < hangar.length; i++ ) {
			String staatTxt;
			if( hangar[i] == null ) {
				staatTxt = "---";
			}
			else {
				staatTxt = hangar[i].toString();
			}
			System.out.println( "* plek " + i + ": " + staatTxt );
		}
	}


	
    /////////////////////////////////////// (c) //////////////////////////////////////////////////////


	public Vliegtuig haalEruit( int plek ) {
		if ( plek < 0 || plek >= hangar.length ) {
			System.out.println( "hangar " + plek + " bestaat niet!" );
			return null;
		} else {
			Vliegtuig v = hangar[plek];
			hangar[plek] = null; //want: Vliegtuig wordt eruit gehaald
			return v;
		}
	}

    /////////////////////////////////////// (d) //////////////////////////////////////////////////////


	public int zetOpEersteVrijePlek( Vliegtuig v ) {
		for ( int i = 0; i < hangar.length; i++ ) {
			if ( hangar[i] == null ) {
				hangar[i] = v;
				return i;
			}
		}
		return -1;
	}
}
