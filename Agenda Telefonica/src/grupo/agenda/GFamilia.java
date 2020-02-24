package grupo.agenda;

public class GFamilia extends Contacto {

	private String relacion;
	private String odiable;
	private String herencia;
	
	// ========== CONSTRUCTORES ==========
	public GFamilia() {
		super();
		this.relacion = "";
		this.odiable = "";
		this.herencia = "";
	}
	
	public GFamilia(String nombre, String numero, String grupo, String relacion, String odiable, String herencia) {
		super(nombre, numero, grupo);
		this.relacion = relacion;
		this.odiable = odiable;
		this.herencia = herencia;
	}

	// ========== SET GET ==========
	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	public String getOdiable() {
		return odiable;
	}

	public void setOdiable(String odiable) {
		this.odiable = odiable;
	}

	public String getHerencia() {
		return herencia;
	}

	public void setHerencia(String herencia) {
		this.herencia = herencia;
	}

	// ========== TOSTRING ==========
	@Override
	public String toString() {
		return super.toString() + "\n Relacion: " + relacion + "\n ¿Te cae bien?: " + odiable + "\n ¿Regala plata?: " + herencia + "\n";
	}
	
	
}
