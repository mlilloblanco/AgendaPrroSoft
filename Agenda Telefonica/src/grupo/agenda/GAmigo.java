package grupo.agenda;

public class GAmigo extends Contacto {

	private String apodo;
	private String ventaja;
	private String utilidad;

	// ========== CONSTRUCTORES ==========
	public GAmigo() {
		super();
		this.apodo = "";
		this.ventaja = "";
		this.utilidad = "";
	}

	public GAmigo(String nombre, String numero, String grupo, String apodo, String ventaja, String utilidad) {
		super(nombre, numero, grupo);
		this.apodo = apodo;
		this.ventaja = ventaja;
		this.utilidad = utilidad;
	}

	// ========== SET GET ==========
	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getVentaja() {
		return ventaja;
	}

	public void setVentaja(String ventaja) {
		this.ventaja = ventaja;
	}

	public String getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}

	// ========== TOSTRING ==========
	@Override
	public String toString() {
		return super.toString() + "\n Apodo: " + apodo + "\n ¿Con ventaja?: " + ventaja + "\n ¿Sirve de algo?: "
				+ utilidad + "\n";
	}

}
