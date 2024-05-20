package co.wordbe.pomodoro

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : CoroutineCrudRepository<Todo, Long>