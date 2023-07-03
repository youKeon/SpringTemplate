package org.example.domain.member.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.example.domain.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "MemberController", description = "회원 API")
@RestController
@RequestMapping("api/v1/members")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/{id}")
    public void getMember(@PathVariable Long id) {
        memberService.getMember(id);
    }
}
