package org.example.domain.team.repository;

import org.example.domain.member.entity.Member;
import org.example.domain.team.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("select t from Team t join fetch t.memberList")
    List<Team> findWithFecthJoin();
}
