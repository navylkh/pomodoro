import co.wordbe.pomodoro.Todo

data class TodoRequest(
    val title: String,
    val description: String = ""
) {
    fun toEntity(): Todo {
        return Todo(
            title = title,
            description = description
        )
    }
}

data class TodoResponse(
    val id: Long,
    val title: String,
    val description: String
) {
    companion object {
        operator fun invoke(todo: Todo): TodoResponse {
            return TodoResponse (
                id = todo.id!!,
                title = todo.title,
                description =  todo.description
            )
        }
    }
}