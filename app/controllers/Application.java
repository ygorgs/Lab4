package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {

	private static Form<Periodo> periodoForm = Form.form(Periodo.class);

	private static PlanoDeCurso plano = new PlanoDeCurso();

	public static Result index() {
		return ok(views.html.index.render(plano.getPeriodos(), periodoForm));
	}

}