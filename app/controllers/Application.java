package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Gives controllers for this application.
 */
public class Application extends Controller {

  /**
   * Home page controller.
   * @return Returns template.
   */
  public static Result index() {
      return ok(index.render("Your new application is ready."));
  }

}
