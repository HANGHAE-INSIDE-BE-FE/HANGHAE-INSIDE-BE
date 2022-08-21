package com.week07.hanghaeinside.repository;

import com.week07.hanghaeinside.domain.Member;
import com.week07.hanghaeinside.domain.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


    Page<Post> findAllByOrderByCreatedAtDesc(Pageable pageable);
}