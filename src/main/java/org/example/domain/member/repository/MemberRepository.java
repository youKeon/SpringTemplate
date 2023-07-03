package org.example.domain.member.repository;

import org.example.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Query("select m from Member m join fetch m.team")
    List<Member> findWithFetch();
}
