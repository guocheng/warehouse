package controllers;

import java.util.LinkedList;
import java.util.List;

import models.Product;
import models.StockItem;
import models.Warehouse;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {	

	
    public static Result index() {
    	Warehouse warehouse = new Warehouse();
    	warehouse.name = "My Warehouse";
    	
    	Product product = new Product();
    	product.name = "Stainless steel paperclips, small, 1000pcs";
    	product.ean = 1234L;
    	product.description = "1000 blue paperclips.";
    	
    	StockItem item = new StockItem();
    	item.quantity = 15L;
    	item.product = product;
    	item.warehouse = warehouse;
    	
    	warehouse.stock.add(item);
    	
    	List<String> output = new LinkedList<String>();
		output.add(String.format("My warehouse is called '%s'", warehouse));
		output.add(String.format("It contains %d items", warehouse.stock.size()));
		output.add(String.format("The first is: %s", warehouse.stock.get(0)));
		return ok(output.toString());
    }

}
