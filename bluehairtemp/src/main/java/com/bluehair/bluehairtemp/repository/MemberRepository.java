package com.bluehair.bluehairtemp.repository;

import com.bluehair.bluehairtemp.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
