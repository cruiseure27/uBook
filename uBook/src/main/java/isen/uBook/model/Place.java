package isen.uBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Place {


	@Id
	@Getter
	@Setter
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Getter
	@Setter
	private String name;
		
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
