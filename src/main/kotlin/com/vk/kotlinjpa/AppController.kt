package com.vk.kotlinjpa

import java.time.Instant
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable


@RestController
class AppController(private var repository: CommentRepository) {

    @RequestMapping("/comment")
    fun getComment() : Comment {
        val comment = Comment(
                author = "codebeast",
                content = "I'm so loving Kotlin",
                created = Instant.now()
        )
        return comment
    }

    @RequestMapping(value = "/comment", method = arrayOf(RequestMethod.POST))
    fun createUser(@RequestBody newComment: NewComment): Comment {
        val comment = Comment(
                author = newComment.author,
                content = newComment.content,
                created = Instant.now()
        )
        repository.save(comment)

        return comment
    }

}