package co.wordbe.pomodoro

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "todo")
data class Todo (
    @Id
    var id: Long? = null,
    val title: String,
    val description: String,
) {

}