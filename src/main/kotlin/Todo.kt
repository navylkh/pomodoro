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
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Todo

        if (id != other.id) return false
        if (title != other.title) return false

        return true
    }

    override fun hashCode(): Int = id.hashCode()
}