package grupo.agenda;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
public class pruebasUnitarias {
	/**
	 * se genera una nueva agenda con un limite predeterminado (15) y se genera un
	 * contacto predeterminado en la agenda
	 */
	Agenda a1 = new Agenda();
	Contacto c1 = new Contacto("Manuel", "91272411", "default");
	private ArrayList<Contacto> list1 = new ArrayList<Contacto>();
	@Before
	public void antesQue() {
		a1.setLista1(list1);
		list1.add(c1);
	}
	@Test
	public void TestExisteContacto() {
		System.out.println("Ejecutando Test Existe Contacto");
		assertTrue(a1.existeContacto("Manuel"));
	}
	@Test
	public void TestEliminarContacto() {
		a1.eliminarContacto("Manuel");
		assertFalse(a1.existeContacto("Manuel"));
	}
	@Test
	public void TestEspacioLibre() {
		a1.espacioLibre();
		assertEquals(14, a1.getTamanoAgenda() - list1.size());
	}
	@Test
	public void TestBuscarContacto() {
		a1.buscarContacto("Manuel");
		assertTrue(a1.existeContacto("Manuel"));
	}
	@Test
	public void TestAgendaLlena() {
		assertFalse(a1.agendaLlena());
	}
	@Test
	public void TestListarContactos() {
		a1.listarContactos();
		assertEquals(c1.toString(), list1.get(0).toString());
		assertTrue(list1.size() == 1);
	}
	@Test
	public void TestAnadirContacto() {
		a1.anadirContacto();
		assertTrue(a1.existeContacto("Willy"));
	}
}