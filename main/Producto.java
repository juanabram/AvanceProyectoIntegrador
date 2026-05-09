package main;

import static main.Libreria.rellenarEspacios;

public class Producto {
	
	String ID ;
	String nombre ;
	String precio ;
	
	public Producto () {
		
	}

	public Producto(String iD, String nombre, String precio) {
		ID = iD;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPrecio() {
		return precio;
	}
	
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return rellenarEspacios ( this.ID , 3 ) + rellenarEspacios ( nombre , 10 ) + rellenarEspacios ( precio , 7 ) ;
	}
	
}
