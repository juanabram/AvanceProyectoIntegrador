package main;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaClases {

	ArrayList<Object> lista = new ArrayList<Object>();
	
	public void Añadir( Object Objecto ) {
		if ( retornar ( 0 ) instanceof Producto ) {
			Producto producto = (Producto) retornar(this.lista.size()-1) ;
			String ID = Integer.parseInt(producto.getID()) + 1 + "";
			Producto nodo = (Producto) Objecto ;
			nodo.setID(ID);
			this.lista.add( nodo ) ;
		}
		else
			this.lista.add( Objecto ) ;
	}
	
	public ListaClases ( Object Objecto ) { 
		super();
		Añadir ( Objecto ) ;
	}

	public int Existe(String id) {
		Iterator<Object> iterador = this.lista.iterator();
		int pos = -1;
		if ( retornar ( 0 ) instanceof Producto ) {
			while (iterador.hasNext()) {
				Producto elemento = (Producto) iterador.next();
				pos++;
				if (elemento.getID().equals(id)) {
					return pos;
				}
			}
		}
		return -1; 
	}
	
	public Object retornar(int pos) {
		try {
		return this.lista.get(pos);
		}
		catch ( Exception e ) {
			throw new IllegalArgumentException("No es una posición valida, Verifique hijo");
		}
	}
	
	public void Modificar(int pos, Object nuevo) {
		this.lista.set(pos, nuevo);
	}
	
	public void Eliminar ( int pos ) {
		this.lista.remove(pos) ;
	}
	
	public String Lista (  ) {
		String cadena = "" ; 
		Iterator<Object> iterador = this.lista.iterator();
		if ( retornar ( 0 ) instanceof Producto ) {
			while (iterador.hasNext()) {
				Producto elemento = (Producto) iterador.next();
				cadena += elemento.toString() ;
			}
			return cadena ;
		}
		return null ;
	}
	
}