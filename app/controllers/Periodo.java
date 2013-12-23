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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

	public List<Disciplina> getPeriodo() {
		return periodo;
	}
>>>>>>> bd0a934132d057b4e6a07f45b4d705314b7dffb1
>>>>>>> a7e350305cfaaea0d73fa80a00022671c44ae31c
	
	//Creator -> Cada periodo é formado por n disciplinas
	//Diminuição do acoplamento -> Os créditos de cada periodo são calculados dentro da classe periodo
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
	
	public List<Disciplina> getDisciplinas(){
		return periodo;
	}

	public int getCreditosAtuais() {
		return creditosAtuais;
	}
	
	
	public void setCreditosAtuais(int creditosAtuais) {
		this.creditosAtuais = creditosAtuais;
	}
}
