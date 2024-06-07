package com.teamsparta.todosecurityproject.domain.feed.todo.dto

import com.teamsparta.todosecurityproject.domain.feed.comment.model.Comment
import com.teamsparta.todosecurityproject.domain.feed.todo.model.TodoCard
import com.teamsparta.todosecurityproject.domain.user.model.User
import java.time.LocalDateTime

data class TodoCardResponse(

    val title: String,
    val description: String,
    val user: User,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?,
)

fun TodoCard.toResponse(): TodoCardResponse {
    return TodoCardResponse(
        title = title,
        description = description,
        createdAt = createdAt,
        updatedAt = updatedAt,
        user = user
    )
}