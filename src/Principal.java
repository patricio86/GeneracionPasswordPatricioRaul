
public class Principal {
	
	
	public static void main(String[]args) {
		
		final int longitud = 25;
		 String seguridad;
		
		Password tablaseguridad[] = new Password [5];
		
		for(int i=0;i<tablaseguridad.length;i++) {
			tablaseguridad[i] = new Password(longitud);
			System.out.println("Password " + i + ":" + tablaseguridad[i].getContraseña());
		}
		
		for(int i=0;i<tablaseguridad.length;i++) {
			
			if(tablaseguridad[i].passwordFuente(tablaseguridad[i].getContraseña()) == true){
				seguridad = "Fuerte!";
			} else {
				seguridad = "Debil!";
			}
			System.out.println("la contraseña Nº: "+(i+1)+" es : "+ tablaseguridad[i].getContraseña()+" "+" " + seguridad);
		}
		
		
		
	}
}
