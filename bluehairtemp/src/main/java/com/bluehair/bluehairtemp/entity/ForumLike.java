package com.bluehair.bluehairtemp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class ForumLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORUM_LIKE_ID")
    private Long forumLikeId;

    //게시글좋아요 --N:1--> 회원
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", nullable = false)
    private Member member;

    //게시글좋아요 --N:1--> 게시글
    @ManyToOne
    @JoinColumn(name = "FORUM_ID", nullable = false)
    private Forum forum;
}
