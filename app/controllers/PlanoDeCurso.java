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
		Disciplina prog1 = new Disciplina("Programacao 1", 4, null,  3);
		Disciplina labProg1 = new Disciplina("Laboratório de Programacao 1", 4, null,  3);
		Disciplina calc1 = new Disciplina("Calculo Diferencial e Integral 1", 4, null,  5);
		Disciplina vetorial = new Disciplina("Algebra Vetorial e Geometria Analítica 1", 4, null,  4);
		Disciplina lpt = new Disciplina("Leitura e Produção de Texto", 4, null,  2);
		Disciplina ic = new Disciplina("Introdução a Computação", 4, null,  3);
		
		Periodo periodo1 = new Periodo();
		
		periodo1.addDisciplina(prog1);
		periodo1.addDisciplina(labProg1);
		periodo1.addDisciplina(calc1);
		periodo1.addDisciplina(vetorial);
		periodo1.addDisciplina(lpt);
		periodo1.addDisciplina(ic);
		fluxo.add(periodo1);
		
		
		// 2º Periodo
		Disciplina[] preProg2 = {prog1, labProg1, ic};
		Disciplina[] preCalc2 = {calc1};
		Disciplina[] preFFC = {calc1, vetorial};
		
		
		Disciplina prog2 = new Disciplina("Programacao 2", 4, preProg2,  3);
		Disciplina labProg2 = new Disciplina("Laboratório de Programacao 2", 4, preProg2,  3);
		Disciplina calc2 = new Disciplina("Calculo Diferencial e Integral 2", 4, preCalc2,  5);
		Disciplina matDisc = new Disciplina("Matemática Discreta", 4, null,  4);
		Disciplina ffc = new Disciplina("Fundamentos de Física Clássica", 4, preFFC,  5);
		Disciplina grafos = new Disciplina("Teoria dos Grafos", 4, preProg2,  3);
		Disciplina metCient = new Disciplina("Metodologia Científica", 4, null,  3);
		
		Periodo periodo2 = new Periodo();
		
		periodo2.addDisciplina(prog2);
		periodo2.addDisciplina(labProg2);
		periodo2.addDisciplina(calc2);
		periodo2.addDisciplina(matDisc);
		periodo2.addDisciplina(ffc);
		periodo2.addDisciplina(grafos);
		periodo2.addDisciplina(metCient);
		
		fluxo.add(periodo2);
		
		// 3º Periodo
		Disciplina[] preEDA = {prog2, labProg2, grafos};
		Disciplina[] preProb = {calc1};
		Disciplina[] preFFM = {calc2, vetorial};
		Disciplina[] preLinear = {vetorial};
		Disciplina[] preTC = {grafos, ic, matDisc};
		
		
		Disciplina EDA = new Disciplina("Estrutura de Dados e Algoritmos", 4, preEDA,  3);
		Disciplina LEDA = new Disciplina("Laboratório de Estrutura de Dados e Algoritmos", 4, preEDA,  3);
		Disciplina linear = new Disciplina("Algebra Linear 1", 4, preLinear,  5);
		Disciplina prob = new Disciplina("Probabilidade e Estatística", 4, preProb,  4);
		Disciplina tc = new Disciplina("Teoria da Computação", 4, preTC,  2);
		Disciplina gi = new Disciplina("Gerência da Informação", 4, null,  3);
		Disciplina FFM = new Disciplina("Fundamentos de Física Moderna", 4, preFFM,  3);
		
		Periodo periodo3 = new Periodo();
		
		periodo3.addDisciplina(EDA);
		periodo3.addDisciplina(LEDA);
		periodo3.addDisciplina(linear);
		periodo3.addDisciplina(prob);
		periodo3.addDisciplina(tc);
		periodo3.addDisciplina(gi);
		periodo3.addDisciplina(FFM);
		
		fluxo.add(periodo3);
		
		return fluxogramaPadrao;
		
		
		// falta terminar de montar as diciplinas e períodos
	}
}
