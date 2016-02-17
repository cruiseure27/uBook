package isen.uBook.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import isen.uBook.model.Member;

@RunWith(SpringJUnit4ClassRunner.class)
public class RepositoryTest {
	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	protected MemberRepository memberRepository;
	@Autowired
	private ClubRepository clubRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private RessourceRepository ressourceRepository;
	
	
	 @Test
	    public void shouldWireRepository() {
		 Member member= new Member();
		 member.setFirstName("Emmanuel");
		 member.setLastName("Mathieu");
	     memberRepository.save(member);
	     Member savedMember=memberRepository.getOne(1);
	     
	     assertEquals(savedMember.getFirstName(),member.getFirstName());
	     
	    }

}
