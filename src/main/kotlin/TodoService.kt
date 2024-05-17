import co.wordbe.pomodoro.Todo
import co.wordbe.pomodoro.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoRepository: TodoRepository
) {
    suspend fun create(todoRequest: TodoRequest): Todo {
        return todoRepository.save(todoRequest.toEntity())
    }
}
