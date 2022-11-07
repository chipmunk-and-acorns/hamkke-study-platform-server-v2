package com.hamkke.hamkkestudyplatformserverv2.repository;

import com.hamkke.hamkkestudyplatformserverv2.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}