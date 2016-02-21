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
public class Place {


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
	private String description;
	
	@Getter
	@Setter
	@JoinColumn(name="id_club")
	@ManyToOne
	private Club club;
	
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
