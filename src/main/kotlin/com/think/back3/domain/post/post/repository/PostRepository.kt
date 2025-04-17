package com.think.back3.domain.post.post.repository

import com.think.back3.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>