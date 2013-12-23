package controllers;

import java.util.ArrayList;
import java.util.List;

public class PlanoDeCurso {

	private ListaDeDisciplinas listaDeDisciplinas;
	private List<Periodo> meuPlanoDeCurso;
	private List<Periodo> fluxogramaPadrao;

	// Creator -> Um plano de Curso é formado por n Periodos
	public PlanoDeCurso() {
		listaDeDisciplinas = new ListaDeDisciplinas();
		meuPlanoDeCurso = new ArrayList<Periodo>();
		geraFluxogramaPadrao();
	}

	public List<Periodo> getPlanoDeCurso() {
		return meuPlanoDeCurso;
	}

	public boolean addDisciplina(Disciplina disciplina, int periodo) {
		while (meuPlanoDeCurso.size() < periodo) {
			meuPlanoDeCurso.add(new Periodo());
		}
		if (checarPreRequisitos(disciplina, periodo)) {
			return meuPlanoDeCurso.get(periodo - 1).addDisciplina(disciplina);
		}
		return false;

	}

	public Periodo getPeriodo(int periodo) {
		return meuPlanoDeCurso.get(periodo - 1);

	}

	public Periodo getPeriodoPadrao(int periodo) {
		return fluxogramaPadrao.get(periodo - 1);
	}

	private boolean checarPreRequisitos(Disciplina disciplina, int periodo) {
		for (Disciplina preRequisito : disciplina.getPreRequisitos()) {
			boolean contem = false;
			for (int i = periodo - 1; i >= 0; i--) {
				if (meuPlanoDeCurso.get(i).getDisciplinas()
						.contains(preRequisito)) {
					contem = true;
					break;
				}
			}if(!contem)
				return false;
		}
		return true;
	}

	private void geraFluxogramaPadrao() {
		this.fluxogramaPadrao = new ArrayList<Periodo>();

		// 1º Periodo
		Periodo periodo1 = new Periodo();

		periodo1.addDisciplina(listaDeDisciplinas
				.getDisciplina("Programacao 1"));
		periodo1.addDisciplina(listaDeDisciplinas
				.getDisciplina("Laboratório de Programacao 1"));
		periodo1.addDisciplina(listaDeDisciplinas
				.getDisciplina("Calculo Diferencial e Integral 1"));
		periodo1.addDisciplina(listaDeDisciplinas
				.getDisciplina("Algebra Vetorial e Geometria Analítica 1"));
		periodo1.addDisciplina(listaDeDisciplinas
				.getDisciplina("Leitura e Produção de Texto"));
		periodo1.addDisciplina(listaDeDisciplinas
				.getDisciplina("Introdução a Computação"));

		fluxogramaPadrao.add(periodo1);
		meuPlanoDeCurso.add(periodo1);

		// 2º Periodo
		Periodo periodo2 = new Periodo();

		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Programacao 2"));
		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Laboratório de Programacao 2"));
		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Calculo Diferencial e Integral 2"));
		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Matemática Discreta"));
		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Fundamentos de Física Clássica"));
		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Teoria dos Grafos"));
		periodo2.addDisciplina(listaDeDisciplinas
				.getDisciplina("Metodologia Científica"));

		fluxogramaPadrao.add(periodo2);

		// 3º Periodo
		Periodo periodo3 = new Periodo();

		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Estrutura de Dados e Algoritmos"));
		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Laboratório de Estrutura de Dados e Algoritmos"));
		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Algebra Linear"));
		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Probabilidade e Estatística"));
		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Teoria da Computação"));
		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Fundamentos de Física Moderna"));
		periodo3.addDisciplina(listaDeDisciplinas
				.getDisciplina("Gerência da Informação"));

		fluxogramaPadrao.add(periodo3);

		// 4º Periodo
		Periodo periodo4 = new Periodo();

		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Organização e Arquitetura de Computadores"));
		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Laboratório de Estrutura de Dados e Algoritmos"));
		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Paradigma de Linguagens de Programação"));
		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Métodos Estatísticos"));
		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Lógica Matemática"));
		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Sistemas de Informação 1"));
		periodo4.addDisciplina(listaDeDisciplinas
				.getDisciplina("Engenharia de Software 1"));

		fluxogramaPadrao.add(periodo4);

		// 5º Periodo
		Periodo periodo5 = new Periodo();

		periodo5.addDisciplina(listaDeDisciplinas
				.getDisciplina("Análise e Técnicas de Algoritmos"));
		periodo5.addDisciplina(listaDeDisciplinas
				.getDisciplina("Informática e Sociedade"));
		periodo5.addDisciplina(listaDeDisciplinas
				.getDisciplina("Redes de Computadores"));
		periodo5.addDisciplina(listaDeDisciplinas.getDisciplina("Compiladores"));
		periodo5.addDisciplina(listaDeDisciplinas
				.getDisciplina("Banco de Dados 1"));
		periodo5.addDisciplina(listaDeDisciplinas
				.getDisciplina("Sistemas de Informação 2"));
		periodo5.addDisciplina(listaDeDisciplinas
				.getDisciplina("Laboratório de Engenharia de Software"));

		fluxogramaPadrao.add(periodo5);

		// 6º Periodo
		Periodo periodo6 = new Periodo();

		periodo6.addDisciplina(listaDeDisciplinas
				.getDisciplina("Sistemas Operacionais"));
		periodo6.addDisciplina(listaDeDisciplinas
				.getDisciplina("Interconexão de Redes de Computadores"));
		periodo6.addDisciplina(listaDeDisciplinas
				.getDisciplina("Laboratório de Interconexão de Redes de Computadores"));
		periodo6.addDisciplina(listaDeDisciplinas
				.getDisciplina("Direito e Cidadania"));
		periodo6.addDisciplina(listaDeDisciplinas
				.getDisciplina("Banco de Dados 2"));
		periodo6.addDisciplina(listaDeDisciplinas
				.getDisciplina("Inteligência Artificial 1"));
		periodo6.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo6.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));

		fluxogramaPadrao.add(periodo6);

		// 7º Periodo
		Periodo periodo7 = new Periodo();

		periodo7.addDisciplina(listaDeDisciplinas
				.getDisciplina("Métodos de Software Numéricos"));
		periodo7.addDisciplina(listaDeDisciplinas
				.getDisciplina("Avaliação de Desempenho de Sistemas Discretos"));
		periodo7.addDisciplina(listaDeDisciplinas
				.getDisciplina("Projeto em Computação 1"));
		periodo7.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo7.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo7.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo7.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));

		fluxogramaPadrao.add(periodo7);

		// 8º Periodo
		Periodo periodo8 = new Periodo();

		periodo8.addDisciplina(listaDeDisciplinas
				.getDisciplina("Métodos de Software Numéricos"));
		periodo8.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo8.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo8.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo8.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));
		periodo8.addDisciplina(listaDeDisciplinas.getDisciplina("Opitativa"));

		fluxogramaPadrao.add(periodo8);

	}
}
