package com.week07.hanghaeinside.repository;

import com.week07.hanghaeinside.domain.member.Member;
import com.week07.hanghaeinside.domain.unheart.UnHeart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnHeartRepository extends JpaRepository<UnHeart, Long> {
    Optional<UnHeart> findByPostIdAndUnHeartBy(Long postId, String memberNickname);

    int countAllByPostId(Long postId);
}
