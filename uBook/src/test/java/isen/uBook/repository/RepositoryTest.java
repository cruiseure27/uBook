package isen.uBook.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import isen.uBook.Application;
import isen.uBook.model.Member;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
public class RepositoryTest extends TestCase{
	@Autowired
	protected MemberRepository memberRepository;

	
	
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
