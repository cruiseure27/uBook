package isen.uBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import isen.uBook.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

	List<Member> findByLastName(String lastName);
	
}
