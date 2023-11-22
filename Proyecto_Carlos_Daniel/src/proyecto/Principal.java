package proyecto;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion = 0, opcionSub = 0, fil = 3, col = 7;
		Random tiempo = new Random(System.nanoTime());
		String[] artista = { "Bad Bunny", "Michael Jackson", "Freddie Mercury" };
		String[] nomCancion = { "1) Amanece", "2) Precio", "3) Philips" };
		String[] diasSemana = { "L", "M", "X", "J", "V", "S", "D" };
		double[] duracion = { 3.5, 3.4, 3.2 };
		double[][] tiempoEscuchado = new double[fil][col];
		double opcDur = 0, desde = 2.2, hasta = 3.5, total = 0, totCancion1 = 0, totCancion2 = 0, totCancion3 = 0;
		boolean encontrada = true;

		do {
			System.out.println("""
					1- Mostrar canciones
					2- Mostrar tiempo semanal escuchado
					3- Sorteo
					4- Cálculo de media
					5- Tiempo escuchado
					0- Salir
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				do {
					System.out.println("""
							Escoja
							-------------------------
							1- Mostrar canciones de una determinada duración
							2- Mostrar canciones de un determinado artista
							0- Volver al menú anterior
							""");
					opcionSub = Leer.datoInt();
					switch (opcionSub) {
					case 1:
						System.out.println("¿Qué duración debe tener la canción?");
						opcDur = Leer.datoDouble();
						encontrada = false;

						for (int i = 0; i < duracion.length; i++) {
							if (opcDur == duracion[i]) {
								System.out.println(artista[i] + " - " + nomCancion[i] + " - " + duracion[i] + " min");
								encontrada = true;
							}
						}

						if (!encontrada) {
							System.out.println("No hay canciones de esa duración");
						}
						break;

					case 2:
						System.out.println("""
								Escoja artista a escuchar:
								----------------------------
								1- Bad Bunny
								2- Michael Jackson
								3- Freddie Mercury
								0- Volver al menú principal
								""");
						opcionSub = Leer.datoInt();
						while (opcionSub > artista.length) {
							System.out.println("Diga un artista disponible");
							System.out.println("""
									----------------------------------------------
									1- Bad Bunny
									2- Michael Jackson
									3- Freddie Mercury
									0- Volver al menú principal
										""");
							opcionSub = Leer.datoInt();
						}
						if (opcionSub == 0) {
							System.out.println("Saliendo...");
						} else {
							System.out.println(artista[opcionSub - 1] + " - " + nomCancion[opcionSub - 1]);
						}

						break;

					case 0:
						System.out.println("Volviendo...");
						break;

					default:
						break;
					}
				} while (opcionSub != 0);
				break;

			case 2:

				for (int i = 0; i < tiempoEscuchado.length; i++) {

					for (int j = 0; j < tiempoEscuchado[i].length; j++) {

						tiempoEscuchado[i][j] = tiempo.nextDouble(hasta - desde + 1) + desde;

					}

				}

				for (int i = 0; i < diasSemana.length; i++) {

					System.out.print("\t\t" + diasSemana[i]);

				}

				System.out.println();

				System.out.println(
						"--------------------------------------------------------------------------------------------------------------------------");

				for (int i = 0; i < nomCancion.length; i++) {

					System.out.print(nomCancion[i] + "\t");

					for (int j = 0; j < tiempoEscuchado[i].length; j++) {

						System.out.printf("%.2f\t\t", tiempoEscuchado[i][j]);

					}

					System.out.println();

				}

				System.out.println();

				break;

			case 5:
				do {

					System.out.println("Indique de qué canción desea saber el total escuchado: ");

					

					System.out.println("0-Salir del programa");

					System.out.println("1-Amanece");

					System.out.println("2-Precios");

					System.out.println("3-Philips");

					

					opcionSub = Leer.datoInt();

					

					switch (opcionSub) {

						case 1:

							for (int i = 2; i < nomCancion.length; i++) {

					            System.out.print(nomCancion[0] + "\t");

					            System.out.println();

					        }

							

				            for (int j = 0; j < tiempoEscuchado[0].length; j++) {

				                System.out.printf("%.2f\t\t", tiempoEscuchado[0][j]);

				            }

							System.out.println();

							

							for (int i = 2; i < nomCancion.length; i++) {

								for (int j = 0; j < tiempoEscuchado[0].length; j++) {

									totCancion1 += tiempoEscuchado[0][j];

								}

							}

							System.out.println("---------------------------------------");

							System.out.printf("El total es: %.2f\n",totCancion1);

							System.out.println("---------------------------------------");

							break;



						case 2: 

							for (int i = 2; i < nomCancion.length; i++) {

					            System.out.print(nomCancion[1] + "\t");

					            System.out.println();

					        }

							

				            for (int j = 0; j < tiempoEscuchado[1].length; j++) {

				                System.out.printf("%.2f\t\t", tiempoEscuchado[1][j]);

				            }

							System.out.println();

							

							for (int i = 2; i < nomCancion.length; i++) {

								for (int j = 0; j < tiempoEscuchado[1].length; j++) {

									totCancion2 += tiempoEscuchado[1][j];

								}

							}

							System.out.println("---------------------------------------");

							System.out.printf("El total es: %.2f\n",totCancion2);

							System.out.println("---------------------------------------");

							break;

							

						case 3:

							for (int i = 2; i < nomCancion.length; i++) {

					            System.out.print(nomCancion[2] + "\t");

					            System.out.println();

					        }

							

				            for (int j = 0; j < tiempoEscuchado[2].length; j++) {

				                System.out.printf("%.2f\t\t", tiempoEscuchado[2][j]);

				            }

							System.out.println();

							

							for (int i = 2; i < nomCancion.length; i++) {

								for (int j = 0; j < tiempoEscuchado[2].length; j++) {

									totCancion3 += tiempoEscuchado[2][j];

								}

							}

							System.out.println("---------------------------------------");

							System.out.printf("El total es: %.2f\n",totCancion3);

							System.out.println("---------------------------------------");

							break;
							
						case 4:
							
							break;

							

						default:

							break;

					}

				} while (opcionSub != 0);
				break;

			default:
				break;
			}
		} while (opcion != 0);

	}

}
