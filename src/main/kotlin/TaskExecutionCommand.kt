// Паттерн Команда
class TaskExecutionCommand(private val task: Task, private val employee: Employee) {
    fun execute() {
        println("Сотрудник ${employee.name} выполняет: ${task.title}")
    }
}