package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String password = "Daniel99";
		String tryPass;
		
		System.out.println("Bienvenido, ¿Cuál es la contraseña?");
		System.out.println("------------------------------------------");
		tryPass = sc.nextLine();
		
		if (tryPass.equals(password)) {
			System.out.println("Contraseña correcta, iniciando sesión...");
		}else {
			System.out.println("Contraseña incorrecta, inténtelo de nuevo más tarde");
		}
		System.out.println("------------------------------------------");
		System.out.println("Gracias y buen día");

	}

}
