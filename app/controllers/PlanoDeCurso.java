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
		
		Disciplina prog1 = new Disciplina("Programacao 1", 4, null, false, 3);
		
		
		return fluxogramaPadrao;
		
		
		// falta terminar de montar as diciplinas e períodos
	}
}
