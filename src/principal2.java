import java.util.*;

public class principal2 {
	public static void main(String[] args) {
		
		String caracteres[] = {"a","b","c","d","e", "f", // declaramos las valores
				   "g","h","i","j", "k", "l", "m", "n", "�", "o",
				   "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z",
				   "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				   "L", "M", "�", "O", "P", "Q", "R", "S", "U", "V", "W", "X","Y", "Z",
				   ".", "*", ",", "["};
		
		String minusculas[] = {"a","b","c","d","e", "f", 
				   "g","h","i","j", "k", "l", "m", "n", "�", "o",
				   "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
		String mayusculas[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				   "L", "M", "�", "O", "P", "Q", "R", "S", "U", "V", "W", "X","Y", "Z"};
		
		String caracteresEspe[] = {".", "*", ",", "["};
		
		crearContrase�as(caracteres, minusculas, mayusculas, caracteresEspe);
	
	}
	
	public static void crearContrase�as(String caracteres[], String minusculas[], String mayusculas[], String caracteresEspe[] ) { //metodo para generar contrase�as
		Scanner sc = new Scanner (System.in);
		int longitud = 0;
		String contrase�a = "";
		
		System.out.println("Introduce la longitud de la contrase�a_");
		longitud = sc.nextInt();
		 
		Password2 password = new Password2(longitud, contrase�a);
		password.generarContrase�a(caracteres);
		
		System.out.println("-------------Segundo ejercicio------------");
		System.out.println("La contrase�a es: " + password.getContrase�a());
		
		System.out.println("Nivel de seguridad de la contrase�a " + password.getContrase�a() + " es "+ password.comprobarContrase�a1(minusculas, mayusculas, caracteresEspe));
		
		
	}
	
	
}
