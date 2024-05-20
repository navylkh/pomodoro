package co.wordbe.pomodoro

import TodoRequest
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoRepository: TodoRepository
) {
    suspend fun create(todoRequest: TodoRequest): Todo {
        return todoRepository.save(todoRequest.toEntity())
    }
}
