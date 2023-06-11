package org.example.domain.member.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.member.entity.Member;

@NoArgsConstructor
@Getter
public class MemberLoginRequest {
    private String name;
    private int age;

    public Member toEntity(MemberLoginRequest request) {
        return Member.builder()
                .name(request.getName())
                .age(request.getAge())
                .build();
    }
}
