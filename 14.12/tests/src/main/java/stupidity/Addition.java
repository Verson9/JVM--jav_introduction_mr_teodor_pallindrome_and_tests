package stupidity;

import java.util.stream.Stream;

public class Addition {

	public int stupidAdd ( int a, String b, boolean c ) {
		if( c ) {
			return a + Integer.parseInt(b);
		}
		return 0;
	}
}
