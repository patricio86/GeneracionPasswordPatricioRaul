import java.util.Random;

/**
 * 
 * @author Patricio
 * CLASE PARA CONTRUIR LA CONTRASEÑA
 */

public class Password {

	/**
	 * CONSTRUCTOR CON LOS ELEMENTOS PARA CONTRUIR LA CONTRASEÑA
	 */
	
	private Integer longitud;
	private String contraseña;
	
	final char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X', 'Y','Z',
            'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
            'n','o','p','r','s','t','u','v','w','x','y','z',
            '1','2','3','4','5','6','7','8','9','0'};
	
	public Password() {
		super();
		this.longitud = 0;
		this.contraseña = "";
	}
	
	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contraseña = this.generarPassword();
	}
	
	public Password(String contraseña) {
		this.longitud = contraseña.length();
		this.contraseña = contraseña;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	/**
	 * FUNCION QUE DEVUELVE LA CONTRASEÑA GENERADA
	 * @return
	 */
	
	public String generarPassword() {
		
		String contraseña = "";
		Random aleatorio = new Random();
		
		for(int i=0; i<this.longitud;i++) {
			contraseña += caracteres[aleatorio.nextInt(caracteres.length)];
		}
		return contraseña;
		
		
	}
	
	/**
	 * METODO QUE COMPRUEBA LA SEGURIDAD DE LA CONTRASEÑA
	 * @param contraseña
	 * @return
	 */
	
	public boolean passwordFuente(String contraseña) {
		 char comparar;
	      boolean encontrado=false;
	      boolean cond=false;
	      int contNumeros=0;
	      int contMayus=0;
	      int contMinus=0;
	      int k=0;
	      for(int i=0; i<this.longitud ;i++){
	         comparar=contraseña.charAt(i);
	         k=0;
	         encontrado=false;
	   
			
			while(!(k==(26-1)) && !(comparar==(caracteres [k]))){
	            k++;
	         }
	         if(comparar==(caracteres[k])){
	            contMayus++;
	            encontrado=true;
	         }
	         
	         k=0;
	         while(encontrado==false && !(k==(26-1)) && !(comparar==(caracteres[k]))){
	            k++;
	         }
	         if(comparar==(caracteres[k])){
	            contMinus++;
	            encontrado=true;
	         }
	         k=0;
	         while(encontrado==false && !(k==(10-1)) && !(comparar==(caracteres[k]))){
	            k++;
	         }
	         if(comparar==(caracteres[k])){
	            contNumeros++;
	         }
	      }
	      if(contMinus>1 && contMayus>2 && contNumeros>5){
	         cond=true;
	      }
	   return cond;	
	}

	
	

	
	
	
	
	
}
