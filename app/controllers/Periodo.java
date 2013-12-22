package controllers;

import java.util.ArrayList;
import java.util.List;

public class Periodo {

	private List<Disciplina> periodo;
	public final int MAXCREDITOS = 28;
	private int creditosAtuais;

	public Periodo() {
		this.setCreditosAtuais(0);
		this.periodo = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getPeriodo() {
		return periodo;
	}

	public boolean addDisciplina(Disciplina disc) {
		if (getCreditosAtuais() + disc.getCreditos() <= MAXCREDITOS) {
			setCreditosAtuais(getCreditosAtuais() + disc.getCreditos());
			this.periodo.add(disc);
			return true;
		}
		return false;
	}

	public boolean removeDisciplina(Disciplina disc) {
		if (getCreditosAtuais() >= 0) {
			setCreditosAtuais(getCreditosAtuais() - disc.getCreditos());
			this.periodo.remove(disc);
			return true;
		}
		return false;
	}

	public int getCreditosAtuais() {
		return creditosAtuais;
	}

	public void setCreditosAtuais(int creditosAtuais) {
		this.creditosAtuais = creditosAtuais;
	}
}
