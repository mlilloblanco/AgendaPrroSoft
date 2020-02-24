/**
 * Esta es una Super Clase y se encarga de construir los Contactos de nuestra Agenda con atributos de: 
 * Nombre, numero y grupo al cual pertenece el contacto.
 */
package grupo.agenda;

public class Contacto {

	private String nombre;
	private String numero;
	private String grupo;

	// ========== CONSTRUCTORES ==========
	public Contacto() {
		this.nombre = "";
		this.numero = "";
		this.grupo = "";
	}

	public Contacto(String nombre) {
		this();
		this.nombre = nombre;

	}

	public Contacto(String nombre, String numero) {
		this();
		this.nombre = nombre;
		this.numero = numero;
	}

	public Contacto(String nombre, String numero, String grupo) {
		this.nombre = nombre;
		this.numero = numero;
		this.grupo = grupo;
	}

	// ========== SET GET ==========
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	// ========== TOSTRING ==========
	@Override
	public String toString() {
		return "\n" + "NOMBRE: " + nombre + "\n Numero: " + numero + "\n Grupo: " + grupo;
	}

}
