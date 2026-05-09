package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Libreria {
	
	public static void decir ( String texto ) {
		System.out.println ( texto ) ;
	}
	
	public static String dialogo ( String texto ) {
		String cadena; 
		decir ( texto + ": " ) ; 
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		try { 
			cadena = lectura.readLine (  ) ;
		}
		catch ( Exception e ) {
			cadena = "" ;
		}
		return cadena; 
	}
	
	public static String rellenarEspacios ( String dato , int tamano ) {
		return String.format ( "%1$-" + tamano + "s" , dato ) ;
	}
	
	public static String desplegarMenu ( String titulo , String [  ] opciones ) {
		String cadena = titulo + "\n" ;
		int contador = 0 ;
		for ( String opcion : opciones ) {
			contador ++ ;
			cadena += contador + ".-" + opcion + "\n" ;
		}
		cadena += "Que opcion deseas" ;
		return dialogo ( cadena ) ;
	}
	
	public static boolean EsNumeroEntero(String dato) {
		for (char c : dato.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
}
