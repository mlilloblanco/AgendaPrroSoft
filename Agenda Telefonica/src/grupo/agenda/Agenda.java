package grupo.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	private static final int CONTACTOS_POR_DEFECTO = 15;
	private int tamanoAgenda;
	private ArrayList<Contacto> lista1 = new ArrayList<Contacto>();

	// ========== CONSTRUCTORES ==========

	public Agenda() {
		this.tamanoAgenda = CONTACTOS_POR_DEFECTO;
		//Contacto c1 = new Contacto();
		//lista1.add(c1);
		
	}

	public Agenda(int tamanoAgenda) {
		this();
		this.tamanoAgenda = tamanoAgenda;
	}

	// ========== SET GET ==========

	public void setTamanoAgenda(int tamanoAgenda) {
		this.tamanoAgenda = tamanoAgenda;
	}

	public ArrayList<Contacto> getLista1() {
		return lista1;
	}

	public void setLista1(ArrayList<Contacto> lista1) {
		this.lista1 = lista1;
	}

	public int getTamanoAgenda() {
		return tamanoAgenda;
	}

	// ========== METODOS ==========
	/**
	 * Agregar un contacto a la lista.
	 */
	public void anadirContacto() {

		if (!agendaLlena()) {

			String nombre = pideTexto("Ingrese nombre del contacto.");
			String numero = pideTexto("Ingrese numero del contacto.");
			String grupo = pideTexto("Ingrese el grupo en el que quiere su contacto.");
			if (!existeContacto(nombre)) {
				switch (grupo) {
				case "Trabajo":
					String correo = pideTexto("Ingrese correo electronico del contacto.");
					String anexo = pideTexto("Ingrese anexo del numero del contacto.");
					String cargo = pideTexto("Ingrese el cargo del contacto.");
					Contacto c0 = new GTrabajo(nombre, numero, grupo, correo, anexo, cargo);
					lista1.add(c0);
					break;
				case "Amigos":
					String apodo = pideTexto("Ingrese apodo del amigue.");
					String ventaja = pideTexto("¿Con ventaja?");
					String utilidad = pideTexto("¿Sirve de algo esta persona?");
					Contacto c1 = new GAmigo(nombre, numero, grupo, apodo, ventaja, utilidad);
					lista1.add(c1);
					break;
				case "Familia":
					String relacion = pideTexto("Ingrese relacion con tu familiar.");
					String odiable = pideTexto("¿Te cae bien?");
					String herencia = pideTexto("¿Regala plata?");
					Contacto c2 = new GFamilia(nombre, numero, grupo, relacion, odiable, herencia);
					lista1.add(c2);
					break;
				default:
					Contacto c = new Contacto(nombre, numero);
					lista1.add(c);
					break;
				}

			} else {
				escribir("Ya existe el contacto.");
			}

		} else {
			escribir("La agenda esta llena.");
		}
	}

	/**
	 * Elimina un contacto de la lista.
	 */
	public void eliminarContacto(String nombre) {

		for (int i = 0; i < lista1.size(); i++) {
			if (lista1.get(i).getNombre().equals(nombre)) {
				lista1.remove(i);
				escribir("contacto eliminado");
			}
		}

	}

	/**
	 * Imprime en pantalla la cantidad de espacio lire en la agenda.
	 */
	public void espacioLibre() {
		int espacioLibre = tamanoAgenda - lista1.size();
		escribir("Quedan " + espacioLibre + " espacio(s) libre(s) en la agenda.");
	}

	/**
	 * Busca e imprime por pantalla el nombre del contacto y su numero.
	 * @param nombre a buscar.
	 */
	public void buscarContacto(String nombre) {
		int contador = 0;

		for (Contacto contacto : lista1) {
			if (contacto.getNombre().equals(nombre)) {
				escribir(contacto.toString());
				contador++;
			}
		}
		if (contador == 0) {
			escribir("El contacto no existe.");
		} else {
			escribir("El contacto existe.");
		}
	}

	/**
	 * Agenda llena, verifica si la agenda esta llena o no.
	 * 
	 * @return retorna un true si esta llena, sio no un false.
	 */
	public boolean agendaLlena() {
		if (lista1.size() < this.tamanoAgenda) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Listar contacto, imprime en pantalla los contactos en la agenda.
	 */
	public void listarContactos() {

		for (Contacto contacto : lista1) {
			escribir(contacto.toString());
		}
	}

	/**
	 * Busca el contacto por medio del nombre.
	 * 
	 * @param nombre a buscar.
	 * @return retorna un true si lo encuentra y un false si no existe.
	 */
	public boolean existeContacto(String nombre) {

		boolean existe = false;

		for (Contacto contacto : lista1) {
			if (contacto.getNombre().equals(nombre)) {
				existe = true;
				return existe;
			}
		}
		return existe;
	}

	// ========== UTILIDADES ==========

	/**
	 * imprime en pantalla un mensaje.
	 * 
	 * @param mensaje el mensaje a imprimir.
	 */
	private void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	/**
	 * Lee por consola un texto y retorna lo escrito.
	 * 
	 * @param mensaje mensaje con la orden
	 * @return retorna lo ingresado por consola
	 */
	private String pideTexto(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}

}
