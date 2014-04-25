package models;

import javax.persistence.*;
import play.db.ebean.Model;

@Entity
public class Product extends Model
{
	@Id
	public Long id;
	
	public Long ean;
	public String name;
	public String description;

	public String toString()
	{
		return name;
	}
}
