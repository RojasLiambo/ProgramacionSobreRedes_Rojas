package model;

import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;

public class readerClass {
	static Reader lector;
	
	public readerClass() {
		lector = new InputStreamReader( System.in );
		
	}
	
	public String leer()
	{
		String cadena="";
		int Byte = 0;
		try {
			while ( ( Byte = lector.read() ) != '\n' )
			{
				if ( Byte != '\r' );
					cadena += (char)Byte;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return cadena;
	}
}
