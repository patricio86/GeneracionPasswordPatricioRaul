
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
			System.out.println("Password 1� ejercicio " + i + ":" + tablaseguridad[i].getContrase�a());
			tablaseguridad2[i] = new Password(longitud);
			System.out.println("Password 2� ejercicio" + i + ":" + tablaseguridad2[i].getContrase�a());
		}
		
		for(int i=0;i<tablaseguridad.length;i++) {
			
			if(tablaseguridad[i].passwordFuente(tablaseguridad[i].getContrase�a()) == true){
				seguridad = "Fuerte!";
			} else {
				seguridad = "Debil!";
			}
			System.out.println("la contrase�a N�: "+(i+1)+" es : "+ tablaseguridad[i].getContrase�a()+" "+" " + seguridad);
			
			if(tablaseguridad2[i].passwordFuente(tablaseguridad2[i].getContrase�a()) == true){
				seguridad = "Fuerte!";
			} else {
				seguridad = "Debil!";
			}
			System.out.println("la contrase�a N�: "+(i+1)+" es : "+ tablaseguridad2[i].getContrase�a()+" "+" " + seguridad);
		}
	}
}
