package isen.uBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Ressource {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name="id_place")
	private Place place;
	
	public Ressource() {
		super();
		// TODO Auto-generated constructor stub
	}

}
