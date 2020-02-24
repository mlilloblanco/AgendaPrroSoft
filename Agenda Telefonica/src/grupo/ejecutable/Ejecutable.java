package grupo.ejecutable;

import java.util.Scanner;

import grupo.agenda.Agenda;
/**
 * @author Andrés Barroso, Takeshi Kita, Cristobal Latorre, Manuel Lillo.
 * @version 1.0.0
 * @copyright Todo el codigo escrito en este programa es de dominio publico.
 * El programa inicia pidiendo el tamaño de la agenda. O sea, la cantidad de contactos que almacenará el arreglo.
 * Después de ingresar el tamaño de la agenda, se desplegará un menú con las acciones a las que puede acceder el usuario.
 * Dependiendo de la selección, el usuario podrá añadir, buscar, eliminar contactos, etc.
 */
public class Ejecutable {

	public static void main(String[] args) {

		for (int i = 0; i < 40; i++) {
			System.out.println("");
		}
		escribir("Bienvenido a tu Agenda Telefonica - PrroSoft");
		escribir("");
		int tamanoAgen = pideNumero(
				"Ingrese tamaño de la agenda. Ingrese 0 para asignar un tamaño por defecto.");

		Agenda miAgenda = new Agenda();

		if (tamanoAgen > 0) {
			miAgenda.setTamanoAgenda(tamanoAgen);
		}

		int indice = 0;
		do {

			escribir("");
			escribir("Elija una opcion.");
			escribir("1. Anadir Contacto.");
			escribir("2. Comprobar existencia de contacto.");
			escribir("3. Mostrar lista de contactos.");
			escribir("4. Buscar contacto.");
			escribir("5. Eliminar contacto.");
			escribir("6. Comprobar espacios disponibles en la Agenda.");
			escribir("7. Salir.");

			indice = pideNumero("");

			switch (indice) {
			case 1:
				miAgenda.anadirContacto();
				break;
			case 2:
				if (miAgenda.existeContacto(pideTexto("Ingrese contacto para comprobar su existencia."))) {
					escribir("El contacto existe en tu Agenda.");
				} else {
					escribir("El contacto no existe en tu Agenda.");
				}
				break;
			case 3:
				miAgenda.listarContactos();
				break;
			case 4:
				miAgenda.buscarContacto(pideTexto("Ingrese contacto a buscar."));
				break;
			case 5:
				miAgenda.eliminarContacto(pideTexto("Ingrese contacto a eliminar."));
				break;
			case 6:
				miAgenda.espacioLibre();
				break;
			case 7:
				escribir("Saliendo...");
				break;

			default:
				break;
			}

		} while (indice != 7);
		
	}

	
	// ========== UTILIDADES ==========
	private static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	private static int pideNumero(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}

	private static String pideTexto(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
	
	
}
