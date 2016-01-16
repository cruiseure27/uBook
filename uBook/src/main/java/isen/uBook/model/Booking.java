package isen.uBook.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	
	@Getter
	@Setter
	@JoinColumn(name="id_member")
	@ManyToOne
	private Member member;
	
	@Getter
	@Setter
	@JoinColumn(name="id_ressource")
	@ManyToOne
	private Ressource ressource;
	
	@Getter
	@Setter
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date beginDate;
	
	@Getter
	@Setter
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date endDate;
	
}
