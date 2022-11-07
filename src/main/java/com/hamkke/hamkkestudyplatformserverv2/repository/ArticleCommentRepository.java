package com.hamkke.hamkkestudyplatformserverv2.repository;

import com.hamkke.hamkkestudyplatformserverv2.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
