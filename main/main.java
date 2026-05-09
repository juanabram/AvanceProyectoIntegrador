package main;

import static main.Libreria.* ;

public class main {

	public static void cargarProductos ( ListaClases Productos ) {
		Productos.Añadir( new ProductoAgranel ( "003","Frijol Negro","35","45" ) );
		Productos.Añadir( new ProductosPerecedero ( "004", "Queso Oaxaca","180","KG","5" ) );
		Productos.Añadir( new ProductoAgranel ( "005","Azucar Estandar","28","100" ) );
		Productos.Añadir( new ProductosPerecedero ( "006", "Jamon de Pavo","130","KG","8" ) );
		Productos.Añadir( new ProductoAgranel ( "007","Lenteja Chica","40","30" ) );
		Productos.Añadir( new ProductosPerecedero ( "008", "Salchicha Viena","65","KG","20" ) );
		Productos.Añadir( new ProductoAgranel ( "009","Avena en Hojuelas","25","25" ) );
		Productos.Añadir( new ProductosPerecedero ( "010", "Tocino Ahumado","210","KG","4" ) );
		Productos.Añadir( new ProductoAgranel ( "011","Harina de Trigo","22","60" ) );
		Productos.Añadir( new ProductosPerecedero ( "012", "Chorizo de Cerdo","95","KG","10" ) );
		Productos.Añadir( new ProductoAgranel ( "013","Maiz Palomero","32","40" ) );
		Productos.Añadir( new ProductosPerecedero ( "014", "Crema Acida","85","L","15" ) );
		Productos.Añadir( new ProductoAgranel ( "015","Sal de Mar","15","80" ) );
		Productos.Añadir( new ProductosPerecedero ( "016", "Mantequilla sin Sal","140","KG","6" ) );
		Productos.Añadir( new ProductoAgranel ( "017","Cacahuate Crudo","55","20" ) );
		Productos.Añadir( new ProductosPerecedero ( "018", "Yogur Natural","45","L","12" ) );
		Productos.Añadir( new ProductoAgranel ( "019","Almendra Entera","250","15" ) );
		Productos.Añadir( new ProductosPerecedero ( "020", "Filete de Tilapia","110","KG","7" ) );
		Productos.Añadir( new ProductoAgranel ( "021","Nuez Pecana","300","10" ) );
		Productos.Añadir( new ProductosPerecedero ( "022", "Carne Molida Especial","160","KG","5" ) );
		Productos.Añadir( new ProductoAgranel ( "023","Semilla de Girasol","60","25" ) );
		Productos.Añadir( new ProductosPerecedero ( "024", "Chuleta Ahumada","125","KG","8" ) );
		Productos.Añadir( new ProductoAgranel ( "025","Garbanzo Seco","45","35" ) );
		Productos.Añadir( new ProductosPerecedero ( "026", "Queso Panela","115","KG","6" ) );
		Productos.Añadir( new ProductoAgranel ( "027","Linaza Molida","38","18" ) );
		Productos.Añadir( new ProductosPerecedero ( "028", "Leche Pasteurizada","25","L","20" ) );
		Productos.Añadir( new ProductoAgranel ( "029","Pimienta Negra","150","5" ) );
		Productos.Añadir( new ProductosPerecedero ( "030", "Costilla de Cerdo","145","KG","9" ) );
		Productos.Añadir( new ProductoAgranel ( "031","Cafe en Grano","220","12" ) );
		Productos.Añadir( new ProductosPerecedero ( "032", "Salchicha para Asar","85","KG","15" ) );
		Productos.Añadir( new ProductoAgranel ( "033","Semilla de Calabaza","110","15" ) );
		Productos.Añadir( new ProductosPerecedero ( "034", "Pavo Entero","95","KG","10" ) );
		Productos.Añadir( new ProductoAgranel ( "035","Chile Seco","180","8" ) );
		Productos.Añadir( new ProductosPerecedero ( "036", "Queso Chihuahua","165","KG","5" ) );
		Productos.Añadir( new ProductoAgranel ( "037","Clavo de Olor","400","2" ) );
		Productos.Añadir( new ProductosPerecedero ( "038", "Longaniza","105","KG","10" ) );
		Productos.Añadir( new ProductoAgranel ( "039","Ajonjoli","75","10" ) );
		Productos.Añadir( new ProductosPerecedero ( "040", "Margarina","65","KG","14" ) );
		Productos.Añadir( new ProductoAgranel ( "041","Harina para Hotcakes","35","30" ) );
		Productos.Añadir( new ProductosPerecedero ( "042", "Huevo Blanco","45","KG","30" ) );
		Productos.Añadir( new ProductoAgranel ( "043","Azucar Mascabado","40","25" ) );
		Productos.Añadir( new ProductosPerecedero ( "044", "Pierna de Pollo","65","KG","12" ) );
		Productos.Añadir( new ProductoAgranel ( "045","Amaranto","50","15" ) );
		Productos.Añadir( new ProductosPerecedero ( "046", "Bistec de Res","190","KG","4" ) );
		Productos.Añadir( new ProductoAgranel ( "047","Frijol Peruano","45","40" ) );
		Productos.Añadir( new ProductosPerecedero ( "048", "Queso Manchego","195","KG","5" ) );
		Productos.Añadir( new ProductoAgranel ( "049","Chia","80","10" ) );
		Productos.Añadir( new ProductosPerecedero ( "050", "Camaron Pacotilla","280","KG","5" ) );
		Productos.Añadir( new ProductoAgranel ( "051","Quinoa","120","8" ) );
		Productos.Añadir( new ProductosPerecedero ( "052", "Suero de Leche","15","L","25" ) );
	}
	
	public static void MenúAñadir ( ListaClases ListaObjectos ) {
		
	}
	
	public static void MenúAñadir ( ListaClases ListaObjectos , Tickets ListAparte) {
		
	}
	
	public static void MenúVentas ( ListaClases ListaObjectos ) {
		Tickets ListaCompras = new Tickets (  ) ;
		String [  ] menu = { "Agregar producto a la cuenta" , "Eliminar producto de la cuenta" , "Ver carrito de compras" , "Cobrar y generar ticket" , "Cancelar venta" } ;
		String opcion = "0" ;
		do {
			opcion = desplegarMenu ( "Punto de Venta" , menu ) ;
			if ( opcion == "" ) 
				decir ( "Opcion no Valida" ) ;
			switch ( opcion ) {
				case "1" : MenúAñadir ( ListaObjectos , ListaCompras ) ; break ;
				case "5" : decir ( "Salida" ) ; break ;
				default : decir ( "No existe esa opción" ) ;
			}
		} while ( opcion.compareTo( "5" ) != 0 ) ;
	}
	
	public static void MenúModificar ( ListaClases ListaObjectos ) {
		decir ( ListaObjectos.Lista () ) ;
		
	}
	
	public static void MenúEliminar ( ListaClases ListaObjectos ) {
		decir ( ListaObjectos.Lista () ) ;
		String opcion = dialogo ( "Cual ID es el producto que quieres eliminar" ) ;
		if ( EsNumeroEntero ( opcion ) ) {
			int pos = ListaObjectos.Existe( opcion ) ;
			if ( ListaObjectos.Existe( opcion ) != -1 ) {
				ListaObjectos.Eliminar ( pos ) ;
				decir ( "Eliminado con Exito" ) ;
			}
			else {
				decir ( "El ID ingresado no esta en la lista" ) ;
			}
		}
		else
			decir ( "Lo ingresado no era un número" ) ;
	}

	public static void MenúAMEL ( ListaClases ListaObjectos ) {
		String [  ] menu = { "Lista" , "Añadir" , "Eliminar" , "Modificar" , "Salida" } ;
		String opcion = "0" ;
		do {
			opcion = desplegarMenu ( "Menú de Productos" , menu ) ;
			if ( opcion == "" ) 
				decir ( "Opcion no Valida" ) ;
			switch ( opcion ) {
				case "1" : decir ( ListaObjectos.Lista () ) ; break ;
				case "2" : MenúAñadir ( ListaObjectos ) ; break ;
				case "3" : MenúEliminar ( ListaObjectos ) ; break ;
				case "4" : MenúModificar ( ListaObjectos ) ; break ;
				case "5" : decir ( "Salida" ) ; break ;
				default : decir ( "No existe esa opción" ) ;
			}
		} while ( opcion.compareTo( "5" ) != 0 ) ;
	}
	
	public static void MenúPrincipal (  ) {
		ListaClases ListaProductos = new ListaClases ( new Producto ( "000",null,null ) ) ;
		cargarProductos ( ListaProductos ) ;
		String [  ] menu = { "Tickets" , "Almacen" , "Ventas" , "Impuestos" , "Proovedores" , "Salida" } ;
		String opcion = "0" ;
		do {
			opcion = desplegarMenu ( "Punto de Venta" , menu ) ;
			if ( opcion == "" ) 
				decir ( "Opcion no Valida" ) ;
			switch ( opcion ) {
				case "1" : decir ( "Menu Tickets" ) ; break ;
				case "2" : MenúAMEL ( ListaProductos ) ; break ;
				case "3" : MenúVentas ( ListaProductos ) ; break ;
				case "4" : decir ( "Menu Impuestos" ) ; break ;
				case "5" : decir ( "Menu Proovedores" ) ; break ;
				case "6" : decir ( "Salida" ) ; break ;
				default : decir ( "No existe esa opción" ) ;
			}
		} while ( opcion.compareTo( "6" ) != 0 ) ;
		
	}
	
	public static void main ( String [  ] args ) {
		MenúPrincipal (  ) ;
	}

}
