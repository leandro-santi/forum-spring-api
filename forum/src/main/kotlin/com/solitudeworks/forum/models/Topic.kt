package com.solitudeworks.forum.models

import java.time.LocalDateTime

data class Topic(var id: Int? = null,
                 var title: String,
                 var question: String,
                 val date: LocalDateTime = LocalDateTime.now(),
                 val course: Course,
                 val author: Author,
                 val status: StatusTopic = StatusTopic.NOT_ANSWERED,
                 val answers: List<Answers> = ArrayList()) {
}