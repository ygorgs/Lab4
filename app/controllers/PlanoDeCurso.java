package controllers;

import java.util.ArrayList;
import java.util.List;

public class PlanoDeCurso {

	private List<Periodo> meuPlanoDeCurso;
	private List<Periodo> fluxogramaPadrao;

	public PlanoDeCurso() {
		meuPlanoDeCurso = new ArrayList<Periodo>();
		this.fluxogramaPadrao = geraFluxogramaPadrao();
	}

	public List<Periodo> getPlanoDeCurso() {
		return meuPlanoDeCurso;
	}

	public void addPeriodo(Periodo periodo) {
		meuPlanoDeCurso.add(periodo);
	}

	public List<Periodo> getFluxogramaPadrao() {
		return fluxogramaPadrao;
	}

	private List<Periodo> geraFluxogramaPadrao() {
		List<Periodo> fluxo = new ArrayList<Periodo>();
		
		// 1º Periodo
		Disciplina prog1 = new Disciplina("Programacao 1", 4, null, false, 3);
		Disciplina labProg1 = new Disciplina("Laboratório de Programacao 1", 4, null, false, 3);
		Disciplina calc1 = new Disciplina("Calculo Diferencial e Integral 1", 4, null, false, 5);
		Disciplina vetorial = new Disciplina("Algebra Vetorial e Geometria Analítica 1", 4, null, false, 4);
		Disciplina lpt = new Disciplina("Leitura e Produção de Texto", 4, null, false, 2);
		Disciplina ic = new Disciplina("Introdução a Computação", 4, null, false, 3);
		
		Periodo periodo1 = new Periodo();
		
		periodo1.addDisciplina(prog1);
		periodo1.addDisciplina(labProg1);
		periodo1.addDisciplina(calc1);
		periodo1.addDisciplina(vetorial);
		periodo1.addDisciplina(lpt);
		periodo1.addDisciplina(ic);
		fluxo.add(periodo1);
		
		
		// 2º Periodo
		Disciplina prog2 = new Disciplina("Programacao 1", 4, null, false, 3);
		Disciplina labProg2 = new Disciplina("Laboratório de Programacao 1", 4, null, false, 3);
		Disciplina calc2 = new Disciplina("Calculo Diferencial e Integral 1", 4, null, false, 5);
		Disciplina matDisc = new Disciplina("Algebra Vetorial e Geometria Analítica 1", 4, null, false, 4);
		Disciplina ffc = new Disciplina("Leitura e Produção de Texto", 4, null, false, 2);
		Disciplina metCient = new Disciplina("Introdução a Computação", 4, null, false, 3);
		
		Periodo periodo2 = new Periodo();
		
		periodo1.addDisciplina(prog1);
		periodo1.addDisciplina(labProg1);
		periodo1.addDisciplina(calc1);
		periodo1.addDisciplina(vetorial);
		periodo1.addDisciplina(lpt);
		periodo1.addDisciplina(ic);
		fluxo.add(periodo1);
		
		
		
		return fluxogramaPadrao;
		
		
		// falta terminar de montar as diciplinas e períodos
	}
}
