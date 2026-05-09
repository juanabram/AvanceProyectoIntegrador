package main;
import static main.Libreria.* ;
public class ProductosPerecedero extends Producto {

	String Unidad ;
	String Cantidad ;
	
	public ProductosPerecedero(String iD, String nombre, String precio,String unidad, String cantidad) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.precio = precio;
		Unidad = unidad;
		Cantidad = cantidad;
	}

	public String getUnidad() {
		return Unidad;
	}
	
	public void setUnidad(String unidad) {
		Unidad = unidad;
	}
	
	public String getCantidad() {
		return Cantidad;
	}
	
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return rellenarEspacios ( this.ID , 3 ) + rellenarEspacios ( nombre , 10 ) + rellenarEspacios ( precio , 7 ) + rellenarEspacios ( Cantidad + Unidad , 10 ) ;
	}

}
