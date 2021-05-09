import java.util.*;

public class principal2 {
	public static void main(String[] args) {
		
		String caracteres[] = {"a","b","c","d","e", "f", // declaramos las valores
				   "g","h","i","j", "k", "l", "m", "n", "ñ", "o",
				   "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z",
				   "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				   "L", "M", "Ñ", "O", "P", "Q", "R", "S", "U", "V", "W", "X","Y", "Z",
				   ".", "*", ",", "["};
		
		String minusculas[] = {"a","b","c","d","e", "f", 
				   "g","h","i","j", "k", "l", "m", "n", "ñ", "o",
				   "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
		String mayusculas[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				   "L", "M", "Ñ", "O", "P", "Q", "R", "S", "U", "V", "W", "X","Y", "Z"};
		
		String caracteresEspe[] = {".", "*", ",", "["};
		
		crearContraseñas(caracteres, minusculas, mayusculas, caracteresEspe);
	
	}
	
	public static void crearContraseñas(String caracteres[], String minusculas[], String mayusculas[], String caracteresEspe[] ) { //metodo para generar contraseñas
		Scanner sc = new Scanner (System.in);
		int longitud = 0;
		String contraseña = "";
		
		System.out.println("Introduce la longitud de la contraseña_");
		longitud = sc.nextInt();
		 
		Password2 password = new Password2(longitud, contraseña);
		password.generarContraseña(caracteres);
		
		System.out.println("-------------Segundo ejercicio------------");
		System.out.println("La contraseña es: " + password.getContraseña());
		
		System.out.println("Nivel de seguridad de la contraseña " + password.getContraseña() + " es "+ password.comprobarContraseña1(minusculas, mayusculas, caracteresEspe));
		
		
	}
	
	
}
