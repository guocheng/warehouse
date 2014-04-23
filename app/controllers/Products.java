package controllers;

import java.util.Set;

import models.Product;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.*;


public class Products extends Controller
{
	public static Result list()
	{
		Set<Product> products = Product.findAll();
		return ok(list.render(products));
	}
	
	public static Result showBlank()
	{
		return TODO;
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
