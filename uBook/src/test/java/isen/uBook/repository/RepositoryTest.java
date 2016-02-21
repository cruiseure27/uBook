package isen.uBook.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

import isen.uBook.Application;
import isen.uBook.model.Booking;
import isen.uBook.model.Member;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = Application.class, initializers = ConfigFileApplicationContextInitializer.class)
public class RepositoryTest extends TestCase{
	@Autowired
	protected MemberRepository memberRepository;
	@Autowired
	protected PlaceRepository placeRepository;
	@Autowired 
	protected ClubRepository clubRepository;
	@Autowired
	protected RessourceRepository ressourceRepository;
	@Autowired
	protected BookingRepository bookingRepository;
	

	
	
	 @Test
	    public void MemberRepositoryTest() {
		 Member member= new Member();
		 member.setFirstName("Emmanuel");
		 member.setLastName("Mathieu");
	     memberRepository.save(member);
	     List<Member> savedMember=memberRepository.findAll();
	     assertEquals(savedMember.get(0).getFirstName(),member.getFirstName());
	     
	    }
	 
	 
	 @Test
	 public void BookingRepositoryTest(){
		 Booking booking = new Booking();
		 booking.setBeginDate(null);
		 booking.setMember(null);
		 booking.setRessource(ressourceRepository.findAll().get(0));
		 bookingRepository.save(booking);
		 Assert.notNull(placeRepository.findAll());
	 }
	 
	 @Test 
	 public void RessourceRepositoryTest(){
		 //Pré-rempli dans le fichier d'import sql
		 Assert.notNull(ressourceRepository.findAll());
	 }
	 
	 @Test
	 public void PlaceRepositoryTest(){
		 //Pré-rempli dans le fichier d'import sql
		 Assert.notNull(placeRepository.findAll());
	 }
	 @Test
	 public void ClubRepositoryTest() {
		//Pré-rempli dans le fichier d'import sql
		 Assert.notNull(clubRepository.findAll());
	     
	 }
	 



}
