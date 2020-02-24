package grupo.agenda;

public class GTrabajo extends Contacto {

	private String correo;
	private String anexo;
	private String cargo;

	// ========== CONSTRUCTORES ==========
	public GTrabajo() {
		super();
		this.correo = "";
		this.anexo = "";
		this.cargo = "";
	}

	public GTrabajo(String nombre, String numero, String grupo, String correo, String anexo, String cargo) {
		super(nombre, numero, grupo);
		this.correo = correo;
		this.anexo = anexo;
		this.cargo = cargo;
	}

	// ========== SET GET ==========
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// ========== TOSTRING ==========
	@Override
	public String toString() {
		return super.toString() + "\n Correo: " + correo + "\n Anexo: " + anexo + "\n Cargo: " + cargo + "\n";
	}

}
