package controllers;


public class Disciplina {

	private String nome;
	private int creditos;
	private Disciplina[] preRequisitos;
	private boolean status;
	private int dificuldade;

	public Disciplina(String nome, int creditos,
			Disciplina[] preRequisitos, boolean status, int dificuldade) {
		this.setCreditos(creditos);
		this.setNome(nome);
		this.setPreRequisitos(preRequisitos);
		this.setStatus(status);
		this.setDificuldade(dificuldade);
	}

	public Disciplina[] getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(Disciplina[] preRequisitos) {
		if (preRequisitos == null) {
			this.preRequisitos = new Disciplina[0];
		} else {
			this.preRequisitos = preRequisitos;
		}
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public boolean equals(Disciplina disc) {
		return (this.getCreditos() == disc.getCreditos()
				&& this.preRequisitos.equals(disc.getPreRequisitos()) && this
				.getNome().equals(this.getNome())) ? true : false;
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
}
