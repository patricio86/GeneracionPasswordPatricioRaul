
public class Principal {
	
	/**
	 * CLASE PRINCIPAL
	 * @param args
	 */
	
	public static void main(String[]args) {
		
		final int longitud = 25;
		 String seguridad;
		 
		 /**
		  * CREACION DE ARRAYS
		  */
		
		Password tablaseguridad[] = new Password [5];
		Password tablaseguridad2[] = new Password[5];
		
		/**
		 * BUCLES PARA MOSTRAR
		 */
		
		for(int i=0;i<tablaseguridad.length;i++) {
			tablaseguridad[i] = new Password(longitud);
			System.out.println("Password 1º ejercicio " + i + ":" + tablaseguridad[i].getContraseña());
			tablaseguridad2[i] = new Password(longitud);
			System.out.println("Password 2º ejercicio" + i + ":" + tablaseguridad2[i].getContraseña());
		}
		
		for(int i=0;i<tablaseguridad.length;i++) {
			
			if(tablaseguridad[i].passwordFuente(tablaseguridad[i].getContraseña()) == true){
				seguridad = "Fuerte!";
			} else {
				seguridad = "Debil!";
			}
			System.out.println("la contraseña Nº: "+(i+1)+" es : "+ tablaseguridad[i].getContraseña()+" "+" " + seguridad);
			
			if(tablaseguridad2[i].passwordFuente(tablaseguridad2[i].getContraseña()) == true){
				seguridad = "Fuerte!";
			} else {
				seguridad = "Debil!";
			}
			System.out.println("la contraseña Nº: "+(i+1)+" es : "+ tablaseguridad2[i].getContraseña()+" "+" " + seguridad);
		}
	}
}
