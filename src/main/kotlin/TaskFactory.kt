// Паттерн Синглтон
class TaskFactory private constructor() {
    private var taskId = 0

    companion object {
        private val instance = TaskFactory()

        fun getInstance(): TaskFactory {
            return instance
        }
    }

    fun createTask(title: String, description: String): Task {
        return Task(taskId++, title, description)
    }
}