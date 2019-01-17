package com.vk.kotlinjpa

import java.time.Instant
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Comment(
        @Id
        @GeneratedValue
        private var id: Int? = null,
        val author: String,
        val content: String,
        val created: Instant
)

@Entity
data class NewComment (
        @Id
        @GeneratedValue
        private var id: Int? = null,
        val author: String,
        val content: String
)