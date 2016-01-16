package isen.uBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import isen.uBook.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

//	List<Booking> findByMember(Member member);
//	
//	List<Booking> findByBeginDate(Date beginDate);
//	
//	List<Booking> findByRessource(Ressource ressource);
}
