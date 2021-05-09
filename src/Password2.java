import java.util.Random;

public class Password2 {

	private int longitud;
	private String contrase�a;
	
	public Password2(int longitud, String contrase�a) {
		super();
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Password2 [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
	public void generarContrase�a(String [] caracteres) {
		int posicion = 0;
		for (int i = 0; i < longitud; i++) {
			posicion = (int)(Math.random()*caracteres.length);// genera un n�mero aleatorio, la cantidad de carateres que contiene el array
			contrase�a = contrase�a + caracteres[posicion];
	}
	}
	public String comprobarContrase�a1(String[] minusculas, String[] mayusculas, String[] caracteresEspe) {
		String estado = "";
		int minuscula = 0;
		int mayuscula = 0;
		int caracteres = 0;
		
		for (int i = 0; i < longitud; i++) {
			for (int j = 0; j < minusculas.length; j++) {
				char letra1 = contrase�a.charAt(i);
				String letra2 = Character.toString(letra1);
				if (letra2.equals(minusculas[j])) {
					minuscula++;
				}
		}
		
		for (int i1 = 0; i1 < longitud; i1++) {
			for (int j = 0; j < mayusculas.length; j++) {
				char letra1 = contrase�a.charAt(i);
				String letra2 = Character.toString(letra1);
				if (letra2.equals(mayusculas[j])) {
					mayuscula++;
				}
			}
		}
		
		for (int i1 = 0; i1 < longitud; i1++) {
			for (int j = 0; j < caracteresEspe.length; j++) {
				char letra1 = contrase�a.charAt(i);
				String letra2 = Character.toString(letra1);
				if (letra2.equals(caracteresEspe[j])) {
					caracteres++;
				}
			}
		}
	}
		if(minuscula >= 2 && mayuscula >= 1 && caracteres >= 1) {// validamos la informaci�n para comprobar la seguridad de la contrase�a
			estado = "fuerte";
		}else {
			estado = "debil";
		}
		return estado;


	}
}
	
	

