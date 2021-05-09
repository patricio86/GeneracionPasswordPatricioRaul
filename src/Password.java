import java.util.Random;

public class Password {

	private Integer longitud;
	private String contrase�a;
	
	final char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X', 'Y','Z',
            'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
            'n','o','p','r','s','t','u','v','w','x','y','z',
            '1','2','3','4','5','6','7','8','9','0'};
	
	public Password() {
		super();
		this.longitud = 0;
		this.contrase�a = "";
	}
	
	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contrase�a = this.generarPassword();
	}
	
	public Password(String contrase�a) {
		this.longitud = contrase�a.length();
		this.contrase�a = contrase�a;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	public String generarPassword() {
		
		String contrase�a = "";
		Random aleatorio = new Random();
		
		for(int i=0; i<this.longitud;i++) {
			contrase�a += caracteres[aleatorio.nextInt(caracteres.length)];
		}
		return contrase�a;
		
		
	}
	
	public boolean passwordFuente(String contrase�a) {
		 char comparar;
	      boolean encontrado=false;
	      boolean cond=false;
	      int contNumeros=0;
	      int contMayus=0;
	      int contMinus=0;
	      int k=0;
	      for(int i=0; i<this.longitud ;i++){
	         comparar=contrase�a.charAt(i);
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
