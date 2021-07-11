package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id); //없으면 널이기때문에 자바8에 들어간 기능
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
