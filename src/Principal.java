
public class Principal {
	
	
	public static void main(String[]args) {
		
		final int longitud = 25;
		 String seguridad;
		
		Password tablaseguridad[] = new Password [5];
		
		for(int i=0;i<tablaseguridad.length;i++) {
			tablaseguridad[i] = new Password(longitud);
			System.out.println("Password " + i + ":" + tablaseguridad[i].getContrase�a());
		}
		
		for(int i=0;i<tablaseguridad.length;i++) {
			
			if(tablaseguridad[i].passwordFuente(tablaseguridad[i].getContrase�a()) == true){
				seguridad = "Fuerte!";
			} else {
				seguridad = "Debil!";
			}
			System.out.println("la contrase�a N�: "+(i+1)+" es : "+ tablaseguridad[i].getContrase�a()+" "+" " + seguridad);
		}
		
		
		
	}
}
