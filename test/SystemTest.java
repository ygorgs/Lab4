import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controllers.Disciplina;
import controllers.ListaDeDisciplinas;
import controllers.Periodo;
import controllers.PlanoDeCurso;


public class SystemTest {

	private ListaDeDisciplinas grade;
	
	@Before
	public void inicializar(){
		grade = new ListaDeDisciplinas();
	}
	
	/*
	 * visito o sistema e ele me exibe uma lista das disciplinas do 1o período já alocadas
	 */
	@Test
	public void deveExibirListaDasDisciplinasDoPrimeiroPeriodo() {
		PlanoDeCurso meuPlano = new PlanoDeCurso();
		Periodo primeiroPeriodo = meuPlano.getPeriodo(1);
		Periodo primeiroPeriodoPadrao = meuPlano.getPeriodoPadrao(1);
		
		for (Disciplina disciplina : primeiroPeriodoPadrao.getDisciplinas()) {
			assertTrue(primeiroPeriodo.getDisciplinas().contains(disciplina));
		}
	}
	/*Uma disciplina tem pré-requisitos, e ela só pode ser incluída se seus prérequisitos 
	 * já foram incluídos no 1o período. 
	 */
	@Test
	public void deveAdicionarDisciplinasComPreRequisitos(){
		PlanoDeCurso meuPlano = new PlanoDeCurso();
		assertTrue(meuPlano.addDisciplina(grade.getDisciplina("Programacao 2"),2));
		assertFalse(meuPlano.addDisciplina(grade.getDisciplina("Estrutura de Dados e Algoritmos"),2));
	}
	
	/*
	 *  Não é possível incluir disciplinas de forma a ter mais de 28 créditos alocados no período.
	 */
	@Test
	public void NaoDeveTerMaisDe28CreditosEmUmPeriodo(){
		PlanoDeCurso meuPlano = new PlanoDeCurso();
		meuPlano.addDisciplina(grade.getDisciplina("Programacao 2"),2);
		meuPlano.addDisciplina(grade.getDisciplina("Laboratório de Programacao 2"),2);
		meuPlano.addDisciplina(grade.getDisciplina("Calculo Diferencial e Integral 2"),2);
		meuPlano.addDisciplina(grade.getDisciplina("Matemática Discreta"),2);
		meuPlano.addDisciplina(grade.getDisciplina("Fundamentos de Física Clássica"),2);
		meuPlano.addDisciplina(grade.getDisciplina("Metodologia Científica"),2);
		meuPlano.addDisciplina(grade.getDisciplina("Opitativa"),2);
		assertFalse(meuPlano.addDisciplina(grade.getDisciplina("Opitativa"),2));
	}
	
	
}
