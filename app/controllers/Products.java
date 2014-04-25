package controllers;

import play.data.Form;
import java.util.Set;
import models.Product;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.*;

public class Products extends Controller
{
	private static final Form<Product> productForm = Form.form(Product.class);
	
	public static Result list()
	{
		return TODO;
	}
	
	public static Result showBlank()
	{
		return ok(show.render(productForm));
	}
	
	public static Result show(Long ean)
	{

		return TODO;
	}
	
	public static Result save()
	{
		return TODO;
	}
}
