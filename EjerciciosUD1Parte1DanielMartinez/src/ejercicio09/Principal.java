package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		
		double navas = 1500, campNou = 99354, u2 = 65000, teatro = 600,
				navasCNou = 0, navasU2 = 0, navasTeatro = 0;
		
		System.out.println("Bienvenido, vamos a calcular las navas que caben"
				+ " en el Camp Nou, en el concierto de U2, \ny en el teatro del colegio");
		System.out.println("***********************************************************************************");
		navasCNou = campNou / navas;
		navasU2 = u2 / navas;
		navasTeatro = teatro / navas;
		System.out.printf("Una nava es igual a %.0f habitantes, por lo que:\n"
				+ "-Camp Nou (%.0f personas): %.2f navas\n"
				+ "-Concierto U2 (%.0f personas): %.2f navas\n"
				+ "-Teatro Colegio (%.0f personas): %.2f navas\n", navas, campNou, navasCNou, u2, navasU2, teatro, navasTeatro);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Gracias y tenga un buen día");

	}

}
