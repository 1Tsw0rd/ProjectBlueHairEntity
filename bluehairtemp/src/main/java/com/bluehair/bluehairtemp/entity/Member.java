package com.bluehair.bluehairtemp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Member extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="MEMBER_ID")
    private Long memberId;

    @Column(name = "MEMBER_NAME", nullable = false, unique = true)
    private String memberName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberRoleEnum role;

    //회원 --1:N--> Forum, Comment, Like(Forum, Comment)
    @OneToMany(mappedBy = "member")
    private List<Forum> forumList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Comment> commentList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<ForumLike> forumLikeList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<CommentLike> commentLikeList = new ArrayList<>();
}
