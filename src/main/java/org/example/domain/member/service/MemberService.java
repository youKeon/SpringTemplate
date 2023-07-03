package org.example.domain.member.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.example.domain.member.entity.Member;
import org.example.domain.member.repository.MemberRepository;
import org.example.domain.team.domain.Team;
import org.example.domain.team.repository.TeamRepository;
import org.springframework.stereotype.Service;

import javax.lang.model.SourceVersion;
import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Service
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;
    public void getMember(Long id) {
        System.out.println("==============팀 전체 조회 쿼리==============");
        List<Team> all = teamRepository.findWithFecthJoin();
        System.out.println("==============팀 전체 조회 쿼리 끝==============");

        System.out.println("==============팀에 속한 멤버 조회 쿼리==============");
        all.forEach(
                team -> {
                    team.getMemberList().forEach(
                            member -> System.out.println("멤버 이름 : " + member.getName())
                    );
                }
        );
        System.out.println("==============팀에 속한 멤버 조회 쿼리 끝==============");

//        System.out.println("==============멤버 전체 조회 쿼리==============");
//        List<Member> all = memberRepository.findAll();
//        System.out.println("==============멤버 전체 조회 쿼리 끝==============");
//
//        System.out.println("==============멤버가 속한 팀 조회 쿼리==============");
//        all.forEach(member -> {
//            System.out.println("Team : " + member.getTeam().getName());
//            System.out.println("Member : " + member.getName());
//        });
//        System.out.println("==============멤버가 속한 팀 조회 쿼리 끝==============");
    }
}
