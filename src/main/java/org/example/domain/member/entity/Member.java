package org.example.domain.member.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Member {
    @Id
    private long id;

    private String name;
    private int age;

    @Builder
    public Member(Long id,
                  String name,
                  int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
