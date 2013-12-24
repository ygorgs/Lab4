package controllers;

import java.util.Arrays;

public class Disciplina {

	private String nome;
	private int creditos;
	private Disciplina[] preRequisitos;
	private boolean status;
	private int dificuldade;
	
	//Information Expert -> Cada disciplina tem um nome, numero de creditos, lista de pre-requisitos e uma dificuldade
	public Disciplina(String nome, int creditos, Disciplina[] preRequisitos,
			int dificuldade) {
		this.setCreditos(creditos);
		this.setNome(nome);
		this.setPreRequisitos(preRequisitos);
		this.status = false;
		this.setDificuldade(dificuldade);
	}
	/**
	 * 
	 * @return lista de pre-requisitos da disciplina
	 */
	public Disciplina[] getPreRequisitos() {
		return preRequisitos;
	}
	
	/**
	 * altera a lista de pre-requisitos da disciplina
	 * 
	 * @param preRequisitos
	 */
	public void setPreRequisitos(Disciplina[] preRequisitos) {
		if (preRequisitos == null) {
			this.preRequisitos = new Disciplina[0];
		} else {
			this.preRequisitos = preRequisitos;
		}
	}
	
	/**
	 * verifica se uma disciplina é Co-Requisito
	 * 
	 * @param preRequisito
	 * @return true ou false
	 */
	public boolean isCoRequisito(Disciplina preRequisito) {
		for (Disciplina disciplina : this.preRequisitos) {
			if(disciplina.equals(preRequisito))
				return true;
		}
		return false;
	}

	public boolean isConcluida() {
		return status;
	}

	public void concluirDisciplina() {
		this.status = true;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		if (dificuldade <= 1) {
			this.dificuldade = 1;
		} else if (dificuldade >= 5) {
			this.dificuldade = 5;
		} else {
			this.dificuldade = dificuldade;
		}
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (creditos != other.creditos)
			return false;
		if (dificuldade != other.dificuldade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(preRequisitos, other.preRequisitos))
			return false;
		return true;
	}

}
