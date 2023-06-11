package org.example.domain.member.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.member.entity.Member;
@NoArgsConstructor
@Getter
public class MemberLoginResponse {
    private Long id;

    private MemberLoginResponse(Long id) {
        this.id = id;
    }

    public static MemberLoginResponse from(Member member) {
        return new MemberLoginResponse(member.getId());
    }
}
