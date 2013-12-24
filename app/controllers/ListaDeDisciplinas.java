package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaDeDisciplinas {
	
	Map<String, Disciplina> disciplinas;
	
	public ListaDeDisciplinas(){
		this.disciplinas = new HashMap<String, Disciplina>();
		preencherDisciplinas();
	}
	
	public Disciplina getDisciplina(String disciplina){
		return this.disciplinas.get(disciplina);
	}

	private void preencherDisciplinas() {
		//1º Periodo
		Disciplina prog1 = new Disciplina("Programacao 1", 4, null,  3);
		Disciplina labProg1 = new Disciplina("Laboratório de Programacao 1", 4, null,  3);
		Disciplina calc1 = new Disciplina("Calculo Diferencial e Integral 1", 4, null,  5);
		Disciplina vetorial = new Disciplina("Algebra Vetorial e Geometria Analítica 1", 4, null,  4);
		Disciplina LPT = new Disciplina("Leitura e Produção de Texto", 4, null,  2);
		Disciplina IC = new Disciplina("Introdução a Computação", 4, null,  3);
		
		disciplinas.put(prog1.getNome(),prog1);
		disciplinas.put(labProg1.getNome(), labProg1);
		disciplinas.put(calc1.getNome(), calc1);
		disciplinas.put(vetorial.getNome(), vetorial);
		disciplinas.put(IC.getNome(), IC);
		disciplinas.put(LPT.getNome(), LPT);
		
		
		//2º Periodo
 		Disciplina[] preProg2 = {prog1, labProg1, IC};
		Disciplina[] preCalc2 = {calc1};
		Disciplina[] preFFC = {calc1, vetorial};
		
		Disciplina prog2 = new Disciplina("Programacao 2", 4, preProg2,  3);
		Disciplina labProg2 = new Disciplina("Laboratório de Programacao 2", 4, preProg2,  3);
		Disciplina calc2 = new Disciplina("Calculo Diferencial e Integral 2", 4, preCalc2,  5);
		Disciplina discreta = new Disciplina("Matemática Discreta", 4, null,  4);
		Disciplina FFC = new Disciplina("Fundamentos de Física Clássica", 4, preFFC,  5);
		Disciplina grafos = new Disciplina("Teoria dos Grafos", 2, preProg2,  2);
		Disciplina metCient = new Disciplina("Metodologia Científica", 4, null,  3);
		
		disciplinas.put(prog2.getNome(), prog2);
		disciplinas.put(labProg2.getNome(), labProg2);
		disciplinas.put(calc2.getNome(), calc2);
		disciplinas.put(discreta.getNome(), discreta);
		disciplinas.put(FFC.getNome(), FFC);
		disciplinas.put(grafos.getNome(), grafos);
		disciplinas.put(metCient.getNome(), metCient);
		
		
		//3º Periodo
		Disciplina[] preEDA = {prog2, labProg2, grafos};
		Disciplina[] preProb = {calc1};
		Disciplina[] preFFM = {calc2, FFC};
		Disciplina[] preLinear = {vetorial};
		Disciplina[] preTC = {grafos, IC, discreta};
		
		Disciplina EDA = new Disciplina("Estrutura de Dados e Algoritmos", 4, preEDA,  3);
		Disciplina LEDA = new Disciplina("Laboratório de Estrutura de Dados e Algoritmos", 4, preEDA,  4);
		Disciplina linear = new Disciplina("Algebra Linear", 4, preLinear,  5);
		Disciplina prob = new Disciplina("Probabilidade e Estatística", 4, preProb,  4);
		Disciplina TC = new Disciplina("Teoria da Computação", 4, preTC,  4);
		Disciplina GI = new Disciplina("Gerência da Informação", 4, null,  3);
		Disciplina FFM = new Disciplina("Fundamentos de Física Moderna", 4, preFFM,  3);
		
		disciplinas.put(EDA.getNome(), EDA);
		disciplinas.put(LEDA.getNome(), LEDA);
		disciplinas.put(linear.getNome(), linear);
		disciplinas.put(prob.getNome(), prob);
		disciplinas.put(TC.getNome(), TC);
		disciplinas.put(GI.getNome(), GI);
		disciplinas.put(FFM.getNome(), FFM);
		
		
		//4º Periodo
		Disciplina[] preOAC = {EDA, LEDA, FFM};
		Disciplina[] prePLP = {EDA, LEDA, TC};
		Disciplina[] preLogica = {TC};
		Disciplina[] preMetodos = {linear, prob};
		Disciplina[] preSI1 = {GI};
		Disciplina[] preES1 = {prob, prog2, labProg2};
		
		Disciplina OAC = new Disciplina("Organização e Arquitetura de Computadores", 4, preOAC,  4);
		Disciplina LOAC = new Disciplina("Laboratório de Estrutura de Dados e Algoritmos", 4, preOAC,  4);
		Disciplina PLP = new Disciplina("Paradigma de Linguagens de Programação", 2, prePLP,  3);
		Disciplina metodos = new Disciplina("Métodos Estatísticos", 4, preMetodos,  4);
		Disciplina logica = new Disciplina("Lógica Matemática", 4, preLogica,  3);
		Disciplina SI1 = new Disciplina("Sistemas de Informação 1", 4, preSI1,  3);
		Disciplina ES1 = new Disciplina("Engenharia de Software 1", 4, preES1,  4);
		
		disciplinas.put(OAC.getNome(), OAC);
		disciplinas.put(LOAC.getNome(), LOAC);
		disciplinas.put(PLP.getNome(), PLP);
		disciplinas.put(metodos.getNome(), metodos);
		disciplinas.put(logica.getNome(), logica);
		disciplinas.put(SI1.getNome(), SI1);
		disciplinas.put(ES1.getNome(), ES1);
		
		
		//5º Periodo
		Disciplina[] preATAL = {EDA, LEDA, calc2, logica};
		Disciplina[] preRC = {OAC,LOAC};
		Disciplina[] preCompiladores = {PLP, OAC, LOAC};
		Disciplina[] preLES = {ES1};
		Disciplina[] preSI2BD1 = {SI1};
		
		Disciplina ATAL = new Disciplina("Análise e Técnicas de Algoritmos", 4, preATAL,  4);
		Disciplina infoSoc = new Disciplina("Informática e Sociedade", 2, null,  1);
		Disciplina RC = new Disciplina("Redes de Computadores", 4, preRC,  3);
		Disciplina compiladores = new Disciplina("Compiladores", 4, preCompiladores,  5);
		Disciplina SI2 = new Disciplina("Sistemas de Informação 2", 4, preSI2BD1,  4);
		Disciplina BD1 = new Disciplina("Banco de Dados 1", 4, preSI2BD1,  3);
		Disciplina LES = new Disciplina("Laboratório de Engenharia de Software", 2, preLES,  3);
		
		disciplinas.put(ATAL.getNome(), ATAL);
		disciplinas.put(infoSoc.getNome(), infoSoc);
		disciplinas.put(RC.getNome(), RC);
		disciplinas.put(compiladores.getNome(), compiladores);
		disciplinas.put(SI2.getNome(), SI2);
		disciplinas.put(BD1.getNome(), BD1);
		disciplinas.put(LES.getNome(), LES);
		
		
		//6º Periodo
		Disciplina[] preSO = {EDA, LOAC};
		Disciplina[] preIRC = {RC};
		Disciplina[] preIA1 = {PLP, metodos, ATAL};
		Disciplina[] preBD2 = {BD1, SI2};
		
		Disciplina SO = new Disciplina("Sistemas Operacionais", 4, preSO,  5);
		Disciplina IRC = new Disciplina("Interconexão de Redes de Computadores", 2, preIRC,  3);
		Disciplina LIRC = new Disciplina("Laboratório de Interconexão de Redes de Computadores", 4, preIRC,  3);
		Disciplina direito = new Disciplina("Direito e Cidadania", 4, null,  1);
		Disciplina BD2 = new Disciplina("Banco de Dados 2", 4, preBD2,  3);
		Disciplina IA1 = new Disciplina("Inteligência Artificial 1", 4, preIA1,  4);
		
		disciplinas.put(SO.getNome(), SO);
		disciplinas.put(IRC.getNome(), IRC);
		disciplinas.put(LIRC.getNome(), LIRC);
		disciplinas.put(direito.getNome(), direito);
		disciplinas.put(BD2.getNome(), BD2);
		disciplinas.put(IA1.getNome(), IA1);
		
		
		//7º Periodo
		Disciplina[] preMSN = {linear, ATAL};
		Disciplina[] preADSD = {prob};
		Disciplina[] preProjeto1 = {metCient, LES};
		
		Disciplina MSN = new Disciplina("Métodos de Software Numéricos", 4, preMSN,  1);
		Disciplina ADSD = new Disciplina("Avaliação de Desempenho de Sistemas Discretos", 4, preADSD,  3);
		Disciplina projeto1 = new Disciplina("Projeto em Computação 1", 4, preProjeto1,  4);
		
		disciplinas.put(MSN.getNome(), MSN);
		disciplinas.put(ADSD.getNome(), ADSD);
		disciplinas.put(projeto1.getNome(), projeto1);
		
		//8º Periodo
		Disciplina[] preProjeto2 = {projeto1};
		
		Disciplina projeto2 = new Disciplina("Projeto em Computação 2", 4, preProjeto2,  4);
		
		disciplinas.put(projeto2.getNome(), projeto2);
		
		//TECC
		Disciplina[] preJogos = {EDA};
		Disciplina[] preRedeSemFio = {RC};
		Disciplina[] preArquiSoft = {ES1, SI1};
		Disciplina[] preRealVirtual = {SI1};
		Disciplina[] preProg3 = {labProg2, prog2};
 		
		Disciplina jogosDigitais = new Disciplina("Jogos Digitais", 4, preJogos,  2);
		Disciplina redesSemFio = new Disciplina("Redes Sem Fio", 4, preRedeSemFio,  4);
		Disciplina arquiSoft = new Disciplina ("Arquitetura de Software", 4, preArquiSoft, 6);
		Disciplina realVirtual = new Disciplina ("Fundamentos e Aplicações de Realidade Virtual", 4, preRealVirtual, 8);
		Disciplina prog3 = new Disciplina ("Programação 3", 4, preProg3, 4);
		Disciplina estagio2 = new Disciplina ("Estagio Integrado 2", 4, null, 6);
		
	
		//Opitatiavas de Outros Departamentos
		Disciplina [] preCalc3 = {calc2};
		Disciplina [] preEquDif = {calc2};
		
		Disciplina futsal = new Disciplina ("Futsal", 2, null, 1);
		Disciplina Basquete = new Disciplina ("Basquete", 2, null, 1);
		Disciplina socInd = new Disciplina ("Sociologia Industrial 1", 4, null, 8);
		Disciplina adm = new Disciplina ("Administração", 4, null, 3);
		Disciplina economia = new Disciplina ("Economia", 4, null, 3);
		Disciplina ingles = new Disciplina ("Ingles", 4, null, 3);
		Disciplina calc3 = new Disciplina ("Calculo Diferencial e Integral 3", 4, preCalc3 , 8);
		Disciplina equDif = new Disciplina ("Equações Diferenciais", 4, preEquDif, 8);
		
		
		
		//Opitativa modelo
		Disciplina opitativa1 = new Disciplina("Opitativa", 4, null,  4);
		
		disciplinas.put(opitativa1.getNome(), opitativa1);

	}
}
