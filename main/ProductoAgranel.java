package main;

import static main.Libreria.rellenarEspacios;

public class ProductoAgranel extends Producto {

	String Cantidad ;

	public ProductoAgranel(String iD, String nombre, String precio,String cantidad) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.precio = precio;
		Cantidad = cantidad;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	@Override
	public String toString() {
		return rellenarEspacios ( this.ID , 3 ) + rellenarEspacios ( nombre , 10 ) + rellenarEspacios ( precio , 7 ) + rellenarEspacios ( Cantidad , 10 ) ;
	}
}
