package isen.uBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Club {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	
//	@Getter
//	@Setter
//	private List<Place> placeList;
//	
//	@Getter
//	@Setter
//	private List<Member> memberList;

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
