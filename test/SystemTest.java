import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controllers.Disciplina;
import controllers.ListaDeDisciplinas;
import controllers.Periodo;
import controllers.PlanoDeCurso;


public class SystemTest {

	@Before
	public void inicializar(){
		ListaDeDisciplinas grade = new ListaDeDisciplinas();
	}
	
	@Test
	public void deveExibirListaDasDisciplinasDoPrimeiroPeriodo() {
		PlanoDeCurso meuPlano = new PlanoDeCurso();
		Periodo primeiroPeriodo = meuPlano.getPeriodo(1);
		Periodo primeiroPeriodoPadrao = meuPlano.getPeriodoPadrao(1);
		
		for (Disciplina disciplina : primeiroPeriodoPadrao.getDisciplinas()) {
			assertTrue(primeiroPeriodo.getDisciplinas().contains(disciplina));
		}
	}
	
	@Test
	public void deveAdicionarDisciplinasComPreRequisitos(){
		
	}
}
