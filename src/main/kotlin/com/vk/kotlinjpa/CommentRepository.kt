package com.vk.kotlinjpa

import org.springframework.data.repository.CrudRepository

interface CommentRepository: CrudRepository<Comment, Int>